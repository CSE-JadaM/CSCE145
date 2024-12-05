// Jada McDuffie
import java.util.Scanner;

public class ChooseYourOwnAdventure {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int playerStrength = 10; // Starting strength points
        System.out.println("Welcome to your Choose Your Own Adventure!");
        System.out.println("You wake up in a room in a abandoned mysterious mansion, with no memory of how you got there.");
        System.out.println("The air is cold and nothing but silence through the hall. ");  
        
        String choice2 = "";
        String choice3 =" ";
        
        // First Decision
        System.out.println("Do you explore deeper into the mansion (type 'explore') or try to find a way out (type 'exit')?");
        String choice1 = input.nextLine();

        if (choice1.equalsIgnoreCase("explore")) {
            // Path 1: Explore the mansion
            System.out.println(" As you explore the mansion you come across a statue of a strange creature in the middle of the hallway. You feel like it watching you.)");
            System.out.println("Suddenly a door creaks open do you investigate (type 'investigate') or keep walking down the hallway (type 'keep walking')?");
             choice2 = input.nextLine();
            
            if (choice2.equalsIgnoreCase("investigate")) {
                // Path 1A: Investigate
                System.out.println("You investigate and find a book on a table in the middle of the room with old symbol.");
                System.out.println("Do you read the book (type 'read') or leave the room immediately (type 'leave')?");
                choice3 = input.nextLine();
                
                if (choice3.equalsIgnoreCase("read")) {
                	//Ending 1: You're Curse
                	System.out.println("As you read the book, the room goes darker. You unleashed a terrible curse on you.");
                	System.out.println("You hear voices and snatch away in the darkenss to never be seen again.");
            } else {
                // Ending 2: Escape the room
                System.out.println("You leave the room immediately feeling a presence of something sinster. You search for a safer path.");
                playerStrength += 5; // Gain strength for escaping
                System.out.println("You gained 5 strength points! Current strength: " + playerStrength);
                System.out.println("You found a way out.");
            	}
            } else {
            	//Path 1B: Down the hallway
            	System.out.println("You continue down the hallway and find a staircase leading the the basement.");
            	System.out.println("Do you go down the stairs to the basement (type'basement') or search the lower floor (type 'lower')?");
                 choice3 = input.nextLine();
                
                if (choice3.equalsIgnoreCase("basement")) {
                    // Ending 3: Encounter bones
                    System.out.println("As you go down to the basement you feel an chill. You see bones appears before you. Then you hear a voice say: 'Don't suffer like me.'");
                    System.out.println("Afraid, you leave the mansion immediately. Vowing to never run. That was a close one ");
                } else {
                    // Ending 4: Discover a secret tunnel
                    System.out.println("On the lower floor, you find a secret tunnel behind a Painting. Putting it aside reveals a secret tunnel."); 
                    System.out.println("You go through the tunnel discovering that it leads out into a swamp. You survive but the mansion would stay a mystery. ");
                    playerStrength += 5; // Gain strength for finding the tunnel
                    System.out.println("You gained 5 strength points! Current strength: " + playerStrength);
                }
            }
        } else {
            // Path 2: Try to find an exit
            System.out.println("You search for an exit, but find only a key and a locked door.");
            System.out.println("Do you use the key on the door (type 'key) or search for another exit (type 'search)? ");
            choice2 = input.nextLine();

            if (choice2.equalsIgnoreCase("key")) {
                // Path 2a: Use the key
                System.out.println("You unlock the door and find yourseslf in a courtyard. The exit seems close, but you hear footsteps behind you.");
                System.out.println("Do you run for the gate (type 'run') or look behind you (type 'look')?");
                choice3 = input.nextLine();
                
                if (choice3.equalsIgnoreCase("run")) { 
                	//Ending 5 : Escape
                	System.out.println("You run for the gate and escape.");
            } else {
                // Ending 6: Captured
                System.out.println("You look behind you. But a mysterious figure grabs you.");
                System.out.println("Everything goes dark and you never seen again");
            	}
            } else {
                // Path 2B: Search for Another Exit
                System.out.println("You search the mansion for another exit, but instead, you find a strange voice that seems to be calling you.");
                System.out.println("Do you follow the voice (type 'voice') or ignore it and continue searching (type 'ignore')?");
                 choice3 = input.nextLine();

                if (choice3.equalsIgnoreCase("voice")) {
                    // Ending 7: Trapped in Another Realm
                    System.out.println("As you follow the voice into a room, the world around you dissolves. You find yourself trapped in a twisted, alternate version of the mansion.");
                    System.out.println("There is no escape from this new realm.");
                } else {
                    // Ending 8: Find the Hidden Exit
                    System.out.println("You survive, but something tells you the mansion will call you back someday.");
                }
            }
        }

        // Final Decision: Bonus Ending based on a compound condition
        System.out.println("Before you leave, you find an ancient bow lying on the ground. Do you take the bow with you (type 'yes' or 'no')?");
        String weapon = input.nextLine();

        if (weapon.equalsIgnoreCase("yes") && (choice2.equalsIgnoreCase("investigate") || choice2.equalsIgnoreCase("keep walking"))) {
        
            // Ending 9: Defeat the Dark Entity
            System.out.println("With the bow in hand, you confront the dark entity that has been haunting the mansion. You defeat it and lift the curse from the mansion.");
            System.out.println("The spirits are freed, and you walk away.");
         // Numeric comparison to determine if the player can defeat the entity
            if (playerStrength >= 20) {
                System.out.println("You have enough strength to defeat the dark entity! You shoot an arrow straight through its heart, lifting the curse from the mansion.");
                System.out.println("The spirits are freed, and you walk away with victory.");
            } else {
                System.out.println("You don't have enough strength to fight the dark entity and you barely escape.");
                System.out.println("You survive, but the curse will haunt you forever.");
            }
        } else {
            // Alternative Ending: Haunted Forever
            System.out.println("You leave the bow behind. As you walk away from the mansion, you can't shake the feeling that something is still following you.");
            System.out.println("You may have escaped, but the darkness has left its mark on you.");
        }

        // Closing the scanner
        input.close();
    }
}