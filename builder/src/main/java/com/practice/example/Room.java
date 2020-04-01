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