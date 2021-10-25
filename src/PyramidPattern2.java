
public class PyramidPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfRows = 9;
		int rowCount = 1;
		
		System.out.println("Here we go for the final pyramid");
		for (int i=noOfRows; i>0; i--)
		{
			for (int j=1; j <=i; j++)
			{
				System.out.print(" ");
			}
		 for (int j =1; j <=rowCount; j++)
		 {
			 System.out.print(rowCount+ " ");
		 }
		 System.out.println();
		 rowCount++;
	   }
	}

}
