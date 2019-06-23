package com.Room;

public class Room {

	private Door door;
	private Chair chair;
	private Bed bed;
	private Almirah almirah;
	private Arzoo arzoo;
	
	public Room(Door door, Chair chair, Bed bed, Almirah almirah, Arzoo arzoo) {
		super();
		this.door = door;
		this.chair = chair;
		this.bed = bed;
		this.almirah = almirah;
		this.arzoo = arzoo;
	}

	public Door getDoor() {
		return door;
	}

	public Chair getChair() {
		return chair;
	}

	public Bed getBed() {
		return bed;
	}

	public Almirah getAlmirah() {
		return almirah;
	}

	public Arzoo getArzoo() {
		return arzoo;
	}
	
	
}
