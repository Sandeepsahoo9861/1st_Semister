
public class MaxElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {44,5,88,11,90};
		int max=a[0];
		  for (int i=1;i<a.length;i++) {
			  if(max<a[i]) {
				  max=a[i];
			  }
			  
			  
			  
		  }
          System.out.print("the max value in the array is "+ max);
	}

}
