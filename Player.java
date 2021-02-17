package game;

import java.util.Arrays;
import java.util.Random;



public class Player {

	String name;
	Object[] wagon = new Object[3];
	Room location;
	
	Player(String name, Room location, Object a, Object b, Object c){
		
		this.name  = name;
		this.location = location;
		wagon[0]= a;
		wagon[1]= b;
		wagon[2]= c;
		
	}
	
	public String toString() {
		
		return " Player:  " + this.name +"\n location: "+ location.name + "\n Wagon: " + Arrays.toString(wagon);
	}
	
	
	public void addObject(Object obj) {

		int index = getFirstEmptyIndex();

		if (index == -1) {
		  Random generator = new Random();
          int i =	generator.nextInt(3)	;	
		  this.wagon[i] = obj;	

//		System.out.println("wagon is full!");
		}else {
		
		this.wagon[index] = obj;
		}
	}
	
	
	
	private int getFirstEmptyIndex() {

		for (int i = 0; i <wagon.length; i++) {
			if (wagon[i] == null) {
				return i;
			}
		}
		return -1;

	}
	 
	
	
	
	public static void main(String[] args) {
		Object table = new Object("table", false);
		Object closet = new Object("closet", false);
		Object chair = new Object("chair", true);
		Object sofa = new Object("sofa", false);
		Object lamp = new Object("lamp", true);
		Object bed = new Object("bed", false);
		Object TV = new Object("TV", true);
		Object shawer = new Object("shawer", false);
		Object toilet = new Object("toilet", false);
		Object shampoo = new Object("shampoo", true);
		Object[] obj = { table, closet, chair, sofa, lamp, bed, TV, shawer, toilet, shampoo };

		Room kitchen = new Room("kitchen", 1, "beautifull and bright", table, chair, lamp);
		Room livingroom = new Room("livingroom", 2, "big and spacious", TV, table, sofa);
		Room bedroom = new Room("bedroom", 3, "small and cozy", bed, lamp, closet);
		Room bathroom = new Room("bathroom", 4, "small and warm", shawer, toilet, shampoo);
		Room[] room = { kitchen, livingroom, bedroom, bathroom };
		
		Player p  = new Player( "A", bedroom, chair, lamp, TV);
			
		      p.addObject(shampoo);
			System.out.println(p.toString());
			
			System.out.println(obj[8].toString());	
				
				
	}
					
			
			
		
	
	

}
