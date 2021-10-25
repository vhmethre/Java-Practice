import java.util.Scanner;

public class StringDemo
{
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String s = sc.nextLine();
		System.out.println("Do you have name");
		String s1 = sc.nextLine();
		if (s1.equalsIgnoreCase("no"))
		{
			System.out.println("You are great");
			
		}
		else {
			
			System.out.println("You are super");
			
		}
		
		
		
		
	}
}
