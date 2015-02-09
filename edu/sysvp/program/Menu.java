package edu.sysvp.program;

import edu.sysvp.program.ClubHelper;
import com.sandklef.edu.ConsoleMenu.*;

public class Menu {
    
    ClubHelper ch ;
    
    public Menu(ClubHelper c) {
	ch = c;
    }

    public void run() {

   	ConsoleMenu menu = new ConsoleMenu("-----===< Club Manager >===-----");
	menu.addMenuItem(new MenuItem(){
		public void menuItemSelected(ConsoleMenuEvent e) { 
		    ch.printMembersAlphaFirstName(); } 
	    },"List members first name in alphabetical order" );

	menu.addMenuItem(new MenuItem(){
		public void menuItemSelected(ConsoleMenuEvent e) { 
		    ch.printMembersAlpha(); } 
	    },"List members surname in alphabetical order" );

	menu.addMenuItem(new MenuItem(){
		public void menuItemSelected(ConsoleMenuEvent e) { 
		    ch.printMembers(); } 
	    },"List members by ID" );

	menu.addMenuItem(new MenuItem(){
		public void menuItemSelected(ConsoleMenuEvent e) { 
		    String input = ch.askUser("Enter search string, you bastard: ");
		    String search = "%" + input.trim() + "%";
		    ch.printMembers(search); 
		}
	    },"Search for member" );

	menu.addMenuItem(new MenuItem(){
		public void menuItemSelected(ConsoleMenuEvent e) { 
		    String input = ch.askUser("Enter search string, Bob Dylan: ");
		    String search = "%" + input.trim() + "%";
		    ch.printMembers(search); 
		}
	    },"One more coffee" );

	menu.run();
    }

}
