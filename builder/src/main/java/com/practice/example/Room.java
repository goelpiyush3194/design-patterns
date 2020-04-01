package com.practice.example;

//builder inheritance with recursive generics
public class Room {
	Fan ceilingFan;
	Tubelight tubeLight;
	TV tv;
	Bed bed;

	@Override
	public String toString() {
		return "Room [ceilingFan=" + ceilingFan + ", tubeLight=" + tubeLight + ", tv=" + tv + ", bed=" + bed + "]";
	}

}

class RoomBuilder<SELF extends RoomBuilder<SELF>> {
	protected Room room = new Room();
	
	public SELF addFan(Fan fan) {
		room.ceilingFan = fan;
		return self();
	}
	
	public SELF addTubelight(Tubelight tubelight) {
		room.tubeLight = tubelight;
		return self();
	}
	
	public SELF addTv(TV tv) {
		room.tv = tv;
		return self();
	}
	
	// unchecked cast, but actually safe
    // proof: try sticking a non-RoomBuilder
    //        as SELF parameter; it won't work!
	protected SELF self() {
		return (SELF) this;
	}
	
	public void clear() {
		room = new Room();
	}

	public Room build() {
		return room;
	}
	
}

class BedBuilder extends RoomBuilder<BedBuilder> {
	
	public BedBuilder addBed(Bed bed) {
		room.bed = bed;
		return self();
	}

	@Override
	protected BedBuilder self() {
		return this;
	}
	
}
