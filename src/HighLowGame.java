 import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100);
		// 2. Print out the random variable above
		//System.out.println(random);
		
		
		// 11. do the following 10 times
		for (int i = 0; i < 10; i++) {
			
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
		String answer = JOptionPane.showInputDialog("Guess a number between 0 and 100");

			// 4. convert the users’ answer to an int (Integer.parseInt(string))
		int answerr = Integer.parseInt(answer);
			
			// 5. if the guess is correct
		if(answerr == random){
			JOptionPane.showMessageDialog(null, "YOU WIN!");
			break;
		}
		if(answerr > random && i < 9){
			JOptionPane.showMessageDialog(null, "Too High. Try Again");
		}
		if(answerr > random && i ==9){
			JOptionPane.showMessageDialog(null, "Too High.");
			JOptionPane.showMessageDialog(null, "YOU LOSE");
		}
		if(answerr < random && i < 9){
			JOptionPane.showMessageDialog(null, "Too Low. Try Again");
		}
		if(answerr < random && i ==9){
			JOptionPane.showMessageDialog(null, "Too Low.");
			JOptionPane.showMessageDialog(null, "YOU LOSE");
		}
				// 6. win
			// 7. if the guess is high
				// 8. tell them it's too high
			// 9. if the guess is low
				// 10. tell them it's too low

		// 12. tell them they lose
		}
		
	}

}
