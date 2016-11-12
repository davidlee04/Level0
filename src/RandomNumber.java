import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int lowest = 999999999;
		int highest = -99999999;
		for (int i = 0; i <= 9000000; i++) {
			int rand = new Random().nextInt();
			a = rand;
			b = rand;
			if(a<lowest){
				lowest = a;
			}
			if(b>highest){
				highest = b;
			}
		}
		System.out.println("Lowest: "+lowest);
		System.out.println("Highest: "+highest);
		System.out.println(Integer.MAX_VALUE);
	}

}
