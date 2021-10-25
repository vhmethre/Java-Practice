
public class PalindromeConcept {

	public static void main(String[] args) {
		String str = "MadaM";
		String str1 = str.toLowerCase();
		if(isPalindrome(str1)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not an Palindrome");
		}

	}
	private static boolean isPalindrome(String str1) {
		char[] charArray = str1.toCharArray();
		for(int i= 0; i < str1.length(); i++) {
			if(charArray[i]!=charArray[(str1.length()-1)-i]) {
				return false;
			}
		}
		return false;
		
		
	}

}
