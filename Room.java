package game;

import java.util.Arrays;

public class Room {
	String name;
	int number;
	String description;
	Object[] appliance = new Object[3];

	Room(String name, int number, String description, Object a, Object b, Object c) {
		this.name = name;
		this.number = number;
		this.description = description;
		appliance[0] = a;
		appliance[1] = b;
		appliance[2] = c;

	}

	public String toSrting() {
		return "** Room number " + this.number + " is the " + this.name + ".**\n  " + this.description + "\n  objects: "
				+ Arrays.toString(appliance);
	}
	
	public String getPlace() {
		return this.name;
	}

	
}
