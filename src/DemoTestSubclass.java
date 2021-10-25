
public class DemoTestSubclass {

	
	void m1()
	{
		System.out.println("Hello World 1");
		System.out.println("Hello World 2");
		System.out.println("Hello World 3");
	}
	
	class DemoTestSubclass1 extends DemoTestSubclass
	{
		void m2()
		{
			System.out.println("Hello World 4");
			System.out.println("Hello World 5");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoTestSubclass t = new DemoTestSubclass();
		// DemoTestSubclass1 k = new DemoTestSubclass1();
		 
	 t.m1();
	// k.m2();
		
	
	}
 
}


