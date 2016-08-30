import javax.swing.JOptionPane;

public class car {
	public static void main(String[] args) {
		String brand = JOptionPane.showInputDialog("What car brand would you like?");
		String model = JOptionPane.showInputDialog("Please enter the car model you want.");
		String color = JOptionPane.showInputDialog("What color car would you like?");
		String year = JOptionPane.showInputDialog("What year?");
		int caryear = Integer.parseInt(year);
		int price = 0;
		if(brand.equals("Toyota")){
			price = 10000;
		}
		if(brand.equals("Porsche")){
			price = 15000;
		}
		if(brand.equals("Lamborghini")){
			price = 200000;
		}
		JOptionPane.showMessageDialog(null, "Your total price is... $"+price);

		
				
	}

}
