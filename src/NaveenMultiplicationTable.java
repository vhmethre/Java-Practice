import java.util.Scanner;

public class NaveenMultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter the number ");
		
	int table =	sc.nextInt();
	
	for(int i=1; i<=10 ; i++) {
		System.out.println(table +"X" +i + "=" +table*i);
	}
		
		
		
		

	}

}
