package com.practice.example;

public class Bed {
	private String cushionFabric;
	private String designType;
	
	public Bed(String cushionWorkType, String designType) {
		this.cushionFabric = cushionWorkType;
		this.designType = designType;
	}

	@Override
	public String toString() {
		return "Bed [cushionFabric=" + cushionFabric + ", designType=" + designType + "]";
	}

}
