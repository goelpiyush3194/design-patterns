package com.practice.example;

public class RoomBuilder {
	protected Room room = new Room();
	
	public RoomBuilder addFan(Fan fan) {
		room.ceilingFan = fan;
		return this;
	}
	
	public RoomBuilder addTubelight(Tubelight tubelight) {
		room.tubeLight = tubelight;
		return this;
	}
	
	public RoomBuilder addTv(TV tv) {
		room.tv = tv;
		return this;
	}
	
	public BedBuilder addBed() {
		return new BedBuilder(room);
	}
	
	public void clear() {
		room = new Room();
	}

	public Room build() {
		return room;
	}
	
}
