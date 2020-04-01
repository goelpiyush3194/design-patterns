package com.practice.example;

class BedBuilder extends RoomBuilder<BedBuilder> {
	public BedBuilder addBed(Bed bed) {
		room.bed = bed;
		return this;
	}

	@Override
	protected BedBuilder self() {
		return this;
	}
	
}