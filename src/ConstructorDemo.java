
public class ConstructorDemo {

	public ConstructorDemo() {
		System.out.println("I am in the default constructor");
	}

	public ConstructorDemo(int a, int b) {
		System.out.println("I am in the parameterized constructor");
	}

	public ConstructorDemo(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo c = new ConstructorDemo();
		ConstructorDemo cd = new ConstructorDemo(4, 5);
		ConstructorDemo st = new ConstructorDemo("Hello");
	}

}
