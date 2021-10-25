
public class NaveenVovelAndConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// a ,e,i,o,u

		char ch = 'e';

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == '0' || ch == 'u') {
			System.out.println(ch + " is Vovel");
		} else {
			System.out.println(ch + " is Consonant");
		}

		// Using switch case 
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch + " is Vovel");
			break;

		default:
			System.out.println(ch + " is Consonant");
			break;

		}
	}

}
