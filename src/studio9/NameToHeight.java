package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		Map <String, Integer> nameHeight = new HashMap<>();
		
		nameHeight.put("Noah", 70);
		nameHeight.put("Elana", 62);
		nameHeight.put("Gigi", 65);
		
		System.out.println("Whose height are you looking for?");
		String name = in.next();
					
		while (name.equals("quit") == false )
		{
			if(nameHeight.containsKey(name)) {
				System.out.println("Height: " + nameHeight.get(name));
				System.out.println("Who's next?");
				name = in.next();
			}
			
			else if (name == "quit")
			{
				System.out.println();
			}
			else
			{
				System.out.println("Name not in map, try another: ");
				name = in.next();
			}
			
		}
	}
}