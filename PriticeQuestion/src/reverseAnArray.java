import java.util.Scanner;
public class reverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of an array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the element");
		for (int i=0;i<=a.length-1;i++) {
			 a[i]=sc.nextInt();
		
		}
		for (int j=a.length-1;j>=0;j-- ) {
			System.out.print(a[j]+" ");
		}
			
	}

}
