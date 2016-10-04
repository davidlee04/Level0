import java.util.Scanner;

public class Adventure {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("You are in a dark room. You can make out a door and hole in the floor. Which one do you want to go down?");
		String answer1 = scanner.nextLine();
		
		
		if(answer1.equalsIgnoreCase("door")){
			System.out.println("You walk through the door and see a flight of stairs. You also see an unlocked window. Which one do you want to go through?");
			String answer2 = scanner.nextLine();
			if(answer2.equalsIgnoreCase("window")){
				System.out.println("Yay you find a magical unicorn outside of the window, and you ride it to the city. Unfortunately it gets hit by a car and you do as well. THE END.");
			}else if(answer2.equalsIgnoreCase("stairs")){
				System.out.println("The stairs lead you to a cute puppy. It lures you in and you follow it. It leads you to the magical world of death. THE END.");
			}else{
				System.out.println("DEATH APPROACHES");
			}
		
		}else if(answer1.equalsIgnoreCase("hole")){
			System.out.println("You fall to the floor and see yourself in a dusty room. It is an old wine cellar. You see an open vent in the ceiling. You also see a ladder that leads back up. Which one do you want to go through?");
			String answer3 = scanner.nextLine();
			if(answer3.equalsIgnoreCase("vent")){
				System.out.println("A sudden fan blows toward you and it's blades magically transports you to death. THE END.");
			}else if(answer3.equalsIgnoreCase("ladder")){
				System.out.println("The ladder leads you up a different room. It has a car in the middle and you get in. The car suddenly accelerates and you blank out. You suddenly find yourself in a dark room. You can make out a door and hole in the floor...");
			
			}else{
				System.out.println("DEATH APPROACHES");
			}
		}else{
			System.out.println("DEATH APPROACHES");
		}
	
		
		
		
	}

}
