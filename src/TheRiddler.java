import javax.swing.JOptionPane;

public class TheRiddler {


	public static void main(String[] args) {


		// 1. Make a variable to hold the score
		int score = 0;


		// 3. Ask the user a riddle. Here are some ideas: bit.ly`/some-riddles
		String answer = JOptionPane.showInputDialog("Paul's height is six feet, he's an assistant at a butcher's shop, and wears size 9 shoes. What does he weigh?");


		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(answer.equalsIgnoreCase("meat")){
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}else{
			JOptionPane.showMessageDialog(null, "Wrong, the answer is meat!");
		}

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
		String answer2 = JOptionPane.showInputDialog("What kind of room has no doors or windows?");
		if(answer2.equalsIgnoreCase("mushroom")){
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}else{
			JOptionPane.showMessageDialog(null, "Wrong, the answer is a mushroom!");
		}

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your got a total score of "+score+"/2");
		
				
		
	}
}
