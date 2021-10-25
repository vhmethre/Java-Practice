import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class arrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int a[][] = { {2,3,4}, {5,6,7} ,{8,9,0}}; int min =0; for (int
		 * i=0;i<a.length; i++) {
		 * 
		 * for(int j=0; j<a.length; j++) {
		 * 
		 * 
		 * System.out.print(a[i][j]);
		 * 
		 * } System.out.println(""); }
		 * 
		 * 
		 * }
		 */

	/*	int a[][] = { { 2, 3, 4 }, { 5, 6, 7 }, { 8, 9, 1 } };
		int min = a[0][0];
		//int max= a[0][0];
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j <3; j++) {

				if (a[i][j] < min) {
					//if(a[i][j]>max
					min = a[i][j];
					//max= a[i][j];

				}

			}
			
		}
		System.out.println(min); */
		
		Date d = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		System.out.println(d.toString());
		System.out.println(sd.format(d));
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.println	(cal.get(cal.DAY_OF_WEEK_IN_MONTH));
				

	}

}
