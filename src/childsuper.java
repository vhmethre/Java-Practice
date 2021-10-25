
public class childsuper extends Parentsuper {
	String name = "Vaijinath Methre";

	public void getStringdata() {
		System.out.println(super.name);
		System.out.println(name);
	}

	public childsuper() {
		super();
		System.out.println("I am child constructor");
	}

	public void getData() {
		super.getData();
		System.out.println("I am in child superclass ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childsuper cd = new childsuper();

		cd.getStringdata();
		cd.getData();
	}

}
