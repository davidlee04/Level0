import javax.swing.JOptionPane;

public class SpudCounter {
	public static void main(String[] args) {
		String potato = JOptionPane.showInputDialog("How many potatoes do you want?");
		int potatoes = Integer.parseInt(potato);
		for (int i = 1; i < potatoes; i++) {
			System.out.println(i+" potatoes");
		}
		System.out.println("and more!");
	}

}
