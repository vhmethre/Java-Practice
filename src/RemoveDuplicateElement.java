
public class RemoveDuplicateElement {

	public static void main(String[] args) {
		int[] a  = {2,3,4,4,5,6,6,5,8,8,4,5,6,7,8,9,2,3,0};
		for(int i=0;i<a.length;i++) {
			int count =0;
			for(int j=0; j<=i; j++) {
				if(a[i]==a[j]) {
				count++;	
				}
				
			}
			if(count<=1) {
				System.out.println(a[i]);
			}
		}
	}

}
