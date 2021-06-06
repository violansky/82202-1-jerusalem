package ex06Loops;

public class Tar2 {
	/*
	 * Create a class that defines two random values and prints all values between
	 * them. note - which variable holds the higher value is not known.
	 */
	public static void main(String[] args) {

		int a = (int) (Math.random() * 51);
		int b = (int) (Math.random() * 51);

		System.out.println("a = " + a + " and b = " + b);

		if (a > b) {
			int t = a;
			a = b;
			b = t;
		}

		for (int i = a; i <= b; i++) {
			System.out.print(i + ", ");
		}

	}

}
