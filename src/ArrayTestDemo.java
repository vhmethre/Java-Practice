
public class ArrayTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayTestDemo t = new ArrayTestDemo();
		
		System.out.println( new ArrayTestDemo());
		System.out.println(t);
		
		ArrayTestDemo[][] a1= new ArrayTestDemo[2][];

		a1[0] = new ArrayTestDemo[2];
		a1[1] = new ArrayTestDemo[3];
		
		System.out.println( a1[0]);
		System.out.println( a1[1]);
	
		char [] c = { 'a', 'b' ,'c', 'd'};
		char [] d = { 'a', 'b' ,'c', 'd'};
		
		System.out.println(c==d);
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		
		
	}
	

}
