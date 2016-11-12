import javax.swing.JOptionPane;


public class BirthdayReminder {


	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "February 9th";
		String sistersBirthday = "June 26th";
		String myBirthday = "August 31st";


		// 2. Find out which birthday the user wants and and store their response in a variable
		String answer = JOptionPane.showInputDialog("What birthday date do you want?");
	
		// 3. Print out what the user typed
		System.out.println(answer+":");
		
		// 4. if user asked for "mom"
			//print mom's birthday
		if(answer.equalsIgnoreCase("mom")){
		System.out.println(momsBirthday);
		}
		else if(answer.equalsIgnoreCase("sister")){
			System.out.println(sistersBirthday);
	    }
		else if(answer.equalsIgnoreCase("david lee")){
			System.out.println(myBirthday);
		}else{
			System.out.println("Sorry, I don't remember that person's birthday!");
		}
		// 5. if user asked for "sister"
			// print sister's birthday
		
		// 6. if user asked for your name
			// print myBirthday
		
		//7. otherwise print "Sorry, i don't remember that person's birthday!"


	} 
}
