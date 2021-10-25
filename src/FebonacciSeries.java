import java.util.Scanner;

public class FebonacciSeries {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int next ;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your number");
		int numTerm=sc.nextInt();
		System.out.println(a+","+b);
		for(int count=3; count<=numTerm; count++) {
			next= a+b;
			System.out.println("," +next);
			a=b;
			b=next;
		}

	}

}
