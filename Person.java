package game;

import java.util.Arrays;

public class Person {
	String name;
	Room place;
	Object[] basket = new Object[1];

	Person(String name, Room place, Object a) {

		this.name = name;
		basket[0] = a;
		this.place = place;
	}

	public String toString() {

		return "Person: " + this.name + "\n place: " + place.name + "\n Basket: " + Arrays.toString(basket);
	}

	public void put() {
		if (basket[0] != null) {
			basket[0] = null;
		}

	}

	public void pick(Object obj) {

		if (basket[0] == null) {
			basket[0] = obj;
		}

	}
	
	public void change () {
	    put();
	   
	    int i = (int) (Math.random() * 4);
		if (place.appliance[i]!= null ) {
	        place.appliance[i]= null;
	        pick(place.appliance[i]);
		}
		
	}
	

	public void walk() {
		int i = (int) (Math.random() * 11);
		if ((i<50 && place.number>1) || place.number==4 ) {
			
			place.number --;
			
		}else {
			place.number ++;
		}
		
	}

}
