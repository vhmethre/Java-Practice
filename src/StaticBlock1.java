
public class StaticBlock1 {
	
	static 
	{
		System.out.println("SB");
	}
	
	static int a= m2();
	static int m2(){ 
	
		System.out.println("SV");
		return 10;
	}
	static void m1()
	{
		System.out.println("m1()");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		System.out.println( "Main");
		
	}

}
