import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {

		// 3. ask the user what color they would like the tortoise to draw
		for (int i = 0; i < 20; i++) {
			
		
		String answer = JOptionPane.showInputDialog("What color do you want the tortoise to draw in?");

		// 4. use an if/else statement to set the pen color that the user
		// requested
		if (answer.equalsIgnoreCase("red")) {
			Tortoise.setPenColor(Color.RED);
		}
		else if (answer.equalsIgnoreCase("blue")) {
			Tortoise.setPenColor(Color.BLUE);
		}
		else if (answer.equalsIgnoreCase("white")) {
			Tortoise.setPenColor(Color.WHITE);
		}
		else if (answer.equalsIgnoreCase("green")) {
            Tortoise.setPenColor(Color.GREEN);
		}
		else if(answer.equalsIgnoreCase("yellow")){
			Tortoise.setPenColor(Color.YELLOW);
		}else{
			Tortoise.setPenColor(Colors.getRandomColor());
		}
		// 5. if the user doesn’t enter anything, choose a random color

		// 6. put a loop around your code so that you keep asking the user for
		// more colors & drawing them

		// 2. set the pen width to 10
		Tortoise.setPenWidth(10);

		// 1. make the tortoise draw a shape (this will take more than one line
		// of code)
		Tortoise.penDown();
		for (int j = 0; j < 4; j++) {
			Tortoise.move(50);
			Tortoise.turn(90);
		}
		}

	}
}