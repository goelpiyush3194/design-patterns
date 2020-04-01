package com.practice.example;

public class RoomBuilder<SELF extends RoomBuilder<SELF>> {
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
