package com.practice.example;


public class Room {
	public Fan ceilingFan;
	public Tubelight tubeLight;
	public TV tv;
	
	public Room() {
		
	}

	public Room(Fan ceilingFan, Tubelight tubeLight, TV tv) {
		this.ceilingFan = ceilingFan;
		this.tubeLight = tubeLight;
		this.tv = tv;
	}

	@Override
	public String toString() {
		return "Room [ceilingFan=" + ceilingFan + "\ntubeLight=" + tubeLight + "\ntv=" + tv + "]";
	}
	
}

class RoomBuilder {
	private Room room = new Room();
	
	public void addFan(Fan fan) {
		room.ceilingFan = fan;
	}
	
	public void addTubelight(Tubelight tubelight) {
		room.tubeLight = tubelight;
	}
	
	public void addTv(TV tv) {
		room.tv = tv;
	}
	
	public void clear() {
		room = new Room();
	}

	public Room build() {
		return room;
	}
	
}
