import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<String>();

		a.add("Vaijinath");
		a.add("Methre");
		a.add("Automation Test Engineer");
		a.add("Hyderabad");
		a.add("Vaijinath");

		System.out.println(a.get(0));
		System.out.println(a.indexOf("Methre"));
		a.remove("Methre");
		System.out.println(a);
		System.out.println(a.size());
		a.add(1, "Methre");
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.contains("Hyderabad"));

	}

}
