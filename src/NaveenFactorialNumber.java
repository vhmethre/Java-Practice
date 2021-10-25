
public class NaveenFactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5;
		getFact(num);

	}

	public static void getFact(int num) {

		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;

		}
		System.out.println("Factorail of " + num + " is: " + fact);

	}

}
