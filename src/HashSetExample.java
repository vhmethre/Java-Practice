import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<String>();

		hs.add("USA");
		hs.add("Geneva");
		hs.add("UK");
		hs.add("INDIA");

		System.out.println(hs);
		hs.add("INDIA");
		System.out.println(hs);
		//hs.remove("UK");
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("INDIA"));
		
		Iterator<String> it=hs.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
