
public class PyramidPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int noOfRows = 9;
		int rowCount = 1;
		
		System.out.println("Here we go for the final pyramid view ");
		
		for (int i= noOfRows;i>0; i--)
		{
			for(int j=1 ; j <=i; j++)
			{
				System.out.print(" ");
			}
			for (int j=1; j<=rowCount; j++)
			{
				System.out.print(" *");
			}
			System.out.println();
			rowCount++;
		}
		
	}

}
