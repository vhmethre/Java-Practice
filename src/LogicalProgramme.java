import java.util.Scanner;

public class LogicalProgramme {

	public static void main(String[] args) {
		
//=====================================================
		/* int a=200 , b=200,c=200;
		
		if(a>b && a>c) {
			System.out.println("A is Greater number");
		}
		else if( b>a && b>c) {
			System.out.println("b is Greater number");
		}
		else {
			System.out.println("c is Greater number");
		}  */
	// ==============================================
		//given number is even or odd
	/*	int num = 23;
		
		if(num%2==0) {
			System.out.println("Given number is Even");
		}
		else {
			System.out.println("Given number is Odd");
		}
//======================================================
		//WAP to check given year is leap or not
		
		int year = 2100;
		
		if(year % 400==0 || (year % 4 ==0 && year % 100 !=0)){
			System.out.println("Its an Leap Year");
		}
			else {
				System.out.println("Its not an Leap Year");
				
			}
//=============================================================		
		//Swap to numbers
		
		int a=20, b=30;
		int t;
		t=a;
		a=b;
		b=t;
		System.out.println("a::" +a);
		System.out.println("b::" +b);
		//=================================================
		  
		 // Accept inputs from user
		  
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = sc.next();
		System.out.println("Please enter Age");
		int age= sc.nextInt();
		System.out.println("Please enter your Gender");
		char gender = sc.next().charAt(0);
		System.out.println("Please enter your Phone number");
		long phonenumber = sc.nextLong();
		System.out.println("----------------------------");
		System.out.println("Name::" +name);
		System.out.println("age::" +age);
		System.out.println("gender::" +gender);
		System.out.println("phonenumber::" +phonenumber); */
		//=======================================================
		//WAP on calculator
	
	/*	String yn;
		do {
		  
	  Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First no");
		int no1 = sc.nextInt();
		System.out.println("Enter your second no");
		int no2 = sc.nextInt();
		System.out.println("Select Symbol(+,-,*,/)");
		String symb = sc.next();
		int res;
		switch(symb) {
				case"+":res=no1+no2;
				System.out.println("Addition of two numbers is::" +res);
				break;
				case"-":res=no1-no2;
				System.out.println("difference of two numbers is::" +res);
				break;
				case"*":res=no1*no2;
				System.out.println("Multiplication of two numbers is::" +res);
				break;
				case"/": res= no1/no2;
				System.out.println("Division of two numbers is::" +res);
				break;
				default:System.out.println("Invalid Symbols");
							
				
		    }
		 System.out.println("Do you want to continue(Press y for Yes and n for No)");
				yn=sc.next();
		} 
		 while(yn.equals("y") || yn.equals("Y")); */
		
		//========================================================
		// WAP on 2's table
		/*
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your number to print table");
		int no=sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			//System.out.println(t*i);
			System.out.println(no+" X " +i +" = "+no*i);
		}
		
		*/
		 
		
//=====================================
		//Factorial of given no.
		
	/*	Scanner sc =new Scanner(System.in);
		System.out.println("Please enter your number");
		int num = sc.nextInt();
		int fact=1 ;
		for(int i=1; i<=num ; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of given number::" +fact);
		
		
		*/
		
		
		
		
	   
	}	
 }
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
     

