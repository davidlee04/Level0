import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String answer1 = JOptionPane.showInputDialog("Are you happy?");
		if(answer1.equalsIgnoreCase("Yes")){
			JOptionPane.showMessageDialog(null,"Keep doing whatever you're doing.");
		}
		if(answer1.equalsIgnoreCase("No")){
			String answer3 = JOptionPane.showInputDialog("Do you want to be happy?");
			if(answer3.equalsIgnoreCase("Yes")){
				JOptionPane.showMessageDialog(null, "Change Something");
			}
			if(answer3.equalsIgnoreCase("No")){
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			}
		}
		
	}

}
