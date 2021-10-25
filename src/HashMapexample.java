import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hs = new HashMap<Integer, String>();

		hs.put(0, "Vaijinath");
		hs.put(1, "Automation Tester");
		hs.put(2, "Trigyn");
		hs.put(3, "Mumnai");

		System.out.println(hs.get(2));
		hs.remove(42);
		System.out.println(hs);
		Set sn = hs.entrySet();
		Iterator it = sn.iterator();

		while (it.hasNext()) {
			Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}

	}

}
