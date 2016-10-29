
public class VotingBooth {
	public static void main(String[] args) {
		int x = 1;
		int y = 0;
		for (int i = 0; i < 100; i++) {
			System.out.println(x);
			int temp = y;
			y = x;
			x=x+temp;

		}
	}

}
//1,1,2,3,5,8,13,21,34,55