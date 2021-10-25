
class NonStaticMeberCont1 
{
  int a=10;
	{
	System.out.println("Superclass NSB");
	}
	NonStaticMeberCont1 (){
    System.out.println("Superclass Constructor");
	}
	void m1(){
	System.out.println("superclass m1()");
	}
}

public class NonStaticMeberCont extends NonStaticMeberCont1
{
   int b=20;
	{
	System.out.println("In subclass NSB");
	}
	NonStaticMeberCont(){
    System.out.println("In subclass Constructor");
	}
	void m1(){
		System.out.println("SubClass m1()");
	}

   public static void main(String[] args) 
	{
		System.out.println("main method");
		NonStaticMeberCont1 n=new NonStaticMeberCont1();
		NonStaticMeberCont1 n2 = new NonStaticMeberCont(); 
		n.m1();
		n2.m1();
	}
}