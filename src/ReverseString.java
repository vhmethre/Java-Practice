
public class ReverseString {

	public static void main(String[] args) {
	/*	String str = "Vaijinath";
		char[] ch = str.toCharArray();
		
		for(int i=ch.length-1; i>=0; i--) {
			System.out.print(ch[i]);
			
		} */
		
		String s= "vaijinath";
		String t= "";
		
		for (int i=s.length()-1 ; i>=0; i--) {
			t= t+s.charAt(i);
		}
		System.out.println(t);
		
	
	
	if(s==(t)) {
		System.out.println("The given number is palindrome");
	}
	else {
		
	}
		System.out.println("The given number is not palindrome");

	}
}
