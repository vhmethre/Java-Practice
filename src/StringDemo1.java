
public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String(" Hello");
		
		System.out.println(str);
		
		System.out.println(str.length());
		
		System.out.println(str.indexOf("o"));
		
		System.out.println("Character at = " + str.charAt(4));
		
		System.out.println(str.toUpperCase());
		
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.compareToIgnoreCase("hello"));
		
		System.out.println(str.trim());
		
	//	System.out.println(str.isBlank());
		
		System.out.println(str.replace("H", "K"));
		
	
		
		
	}

}
