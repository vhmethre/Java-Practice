import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayListContent {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("Selenium");
		l.add("Automation");
		l.add("Project");
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);
		

	}

}
