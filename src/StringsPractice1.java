
public class StringsPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  str = "Welcome java";
		
	System.out.println(str.charAt(1));
	System.out.println(str.concat(" to Java"));
	System.out.println(str.length());
	System.out.println(str.trim());
	System.out.println(str.toUpperCase());
	System.out.println(str.toLowerCase());
	//System.out.println(str.isBlank());
	System.out.println(str.replace("Welcome", "My home"));
	System.out.println(str.charAt(4));
		
	StringBuffer sd = new StringBuffer("Welcome");
	System.out.println(sd.append(" to Java"));
	System.out.println(sd.reverse());
	
	String s = "\'Java" + " Concept" + " Of" + " The"+ " Day.\'";
	
	System.out.println(s);
	
	String s1 = new String( "Java");
	String s2 = new String( " Concept");
	String s3 = new String( " Of");
	String s4 = new String( " The");
	String s5 = new String( " Day");
	
	System.out.println(s1+s2+s3+s4+s5);

	int i = 50;
	String k = "Java ";
	System.out.println(k+i);
	
	Double  d = 300.42;
	Float f =  30.513f;
	char a = 'm';
	boolean b = true;
	
	System.out.println(k+d+f+a+b);
	
	String k1 = "JAVA";
	String k2 = " APPLICATION";
	
	System.out.println(k1.concat(k2));
	
	
	
	}

}
