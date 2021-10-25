
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer str = new StringBuffer("Welcome");
		
		System.out.println(str);
		
		// System.out.println(str.reverse());
		
		System.out.println(str.append(" to Java"));
		
		System.out.println(str.insert(7, " eLearn"));
		
		System.out.println(str.deleteCharAt(8));
		
		System.out.println(str.indexOf("WELCOME"));
		
		System.out.println(str.charAt(6));
		
		System.out.println(str.substring(7));
		
		System.out.println(str.subSequence(11, 15));
		
		System.out.println(str);
		
		StringBuffer str1 = new StringBuffer("Vaijinath");
		
		System.out.println(str1);
		
		StringBuffer str2 = new StringBuffer("Methre");
		
		System.out.println(str2);
		
		//System.out.println(str1.compareTo(str2));
		
	}

}
