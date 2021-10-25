import java.util.Random;

public class NaveenRandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "123";

		int n = Integer.parseInt(s);

		System.out.println(n);

		System.out.println("*******************");

		Random random = new Random();
		System.out.println("Random numbers::" + random.nextInt());
		System.out.println("Random  double numbers::" + random.nextDouble());
		System.out.println("Random long numbers::" + random.nextLong());
		System.out.println("Random float numbers::" + random.nextFloat());

	}

}
