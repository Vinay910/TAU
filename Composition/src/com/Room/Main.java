package com.Room;

public class Main {

	public static void main(String[] args) {
		Dimensions dimensions=new Dimensions(100, 100);
		Bed bed=new Bed("RED", dimensions);
		Chair chair=new Chair("RED", 4, dimensions);
		Door door =new Door("RED", 1, true, dimensions);
		Almirah almirah=new Almirah("RED", door, dimensions);
		Arzoo arzoo=new Arzoo("Zookie", 2, 2, true, dimensions);
		Room room =new Room(door, chair, bed, almirah, arzoo);
		System.out.println(room.getAlmirah().getDimensions());

	}

}
