
public class ThisDemo {

	int a = 5;

	public void getdata() {
		int a = 10;

		int c = a + this.a;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println("Sum of two numbers is " + c);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo cd = new ThisDemo();
		cd.getdata();
	}

}
