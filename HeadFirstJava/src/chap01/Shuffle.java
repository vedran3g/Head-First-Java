package chap01;

public class Shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub<
		int x = 3;
		while (x > 0) {
			if (x > 2) {
				System.out.print("a");
				System.out.print("-");
			}
			if (x == 2) {
				System.out.print("b c");
				System.out.print("-");
			}
			if (x == 1) {
				System.out.print("d");
			}
			x--;
		}

	}

}
