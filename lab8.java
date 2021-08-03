package lab8;

/* Kayla Wagner CSC1301 lab 8
*/
public class lab8 {
	public static void main(String[] args) {
		question1();
		question2();
		question3();
	}

	public static void question1() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print((int) Math.pow(i, j));
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void question2() {
		for (int i = 1; i <= 7; i = i + 2) {
			for (int k = 1; k <= 10; k++) {
				System.out.print(i * k + " ");
			}
			System.out.println();

		}
		System.out.println();
	}

	public static void question3() {
		int SEGMENT = 3, HEIGHT = 4;
		//controls number of groups
		for (int i = SEGMENT; i >= 1; i--) {
			int count = 0;
			//controls which elevation is currently active
			for (int j = HEIGHT; j >=1; j--) {
				//centers the stack of output based on the current elevation
				for(int x = 1; x <= count; x++) {
					System.out.print(" ");
				}
				//controls output based on current elevation
				for (int k = ((2*j)-1); k >= 1; k--) {
					System.out.print("*");
				}
				System.out.println();
				count++;
			}
			System.out.println();
		}
	}
}
