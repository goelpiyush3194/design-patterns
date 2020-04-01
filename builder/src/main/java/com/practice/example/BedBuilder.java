package com.practice.example;

class BedBuilder extends RoomBuilder {
	public BedBuilder(Room room) {
		this.room = room;
	}

	public BedBuilder manufacturesBed(Bed bed) {
		room.bed = bed;
		return this;
	}
	
}