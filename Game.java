package game;

import java.awt.event.ActionListener;

public class Game {

	static Gui gui;
	static Person pe;
	static Player pl;
	static String command;

//	public Game() {
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

		pe = new Person(" Alex", livingroom, lamp);
		pl = new Player(" Mat", kitchen, lamp, chair, shampoo);
		gui = new Gui();

		Gui.showRoom.setText(pl.location.toSrting());
		Gui.showplayer.setText(pl.toString());
		Gui.showperson.setText(pe.toString());

		ActionListener inputListener = e -> {
			command = Gui.input.getText();
			
//			for (int i = 0; i < 4; i++) {
//
//				if (command.equals(room[i].name)) {
//                    
//					pl.location = room[i];
//					Gui.showRoom.setText(pl.location.toSrting());
//					Gui.showplayer.setText(pl.toString());
//
//				}
//			}

			for (int k = 0; k < 10; k++) {
				
			
				if (command.equals(obj[k].name)) {

					System.out.println(obj[k].name);
					
					Object x = obj[k];
					System.out.println(k);
					pl.addObject(x);
					pl.toString();
					System.out.println(pl.toString());
					Gui.showRoom.setText(pl.location.toSrting());
					Gui.showplayer.setText(pl.toString());

				}

			}

		};

		Gui.button.addActionListener(inputListener);

	}
	
	
	
}
