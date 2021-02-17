package game;

public class Object {
    String name;
    boolean moveable;
	
	
	Object(String Name , boolean Moveable){
		
		name = Name;
		moveable = Moveable;
		
	}
	
	public String toString() {
	
		return name ;
	}

}
