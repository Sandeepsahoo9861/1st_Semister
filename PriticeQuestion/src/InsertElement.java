//Insert an element in array
public class InsertElement {

	public static void main(String[] args) {
		int indexpos=3; 
		int element=5;
		int a[]= {20,47,73,45,56,78};
		for(int i=a.length-1; i>indexpos;i--) {
			 a[i]=a[i-1];
			 
		
		}
		 a[3]=element;
		 for (int j=0;j<=a.length-1;j++) {
			 System.out.print(a[j] + " ");
		 }
		

	}

}
