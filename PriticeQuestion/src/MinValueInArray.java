
public class MinValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {44,4,22,5,66,3,55};
		int min=a[0];
		for (int i=1;i<=a.length-1;i++) {
			if (min>a[i]) {
				min=a[i];
			}
		}
		
    System.out.println("the minimum value from array is" + min);
	}

}
