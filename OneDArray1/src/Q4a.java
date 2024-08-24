import java.util.Scanner;
public class Q4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Ten Numbers :");
		double a[] = new double[10];
		for(int i=0; i<10; i++)
		{
			a[i]=sc.nextDouble();
		}
		System.out.println("Smallest Number is the array ="+min(a));
	}
	public static double min(double array[])
	{
		double min=array[0];
		for(int a=1; a<10; a++)
		{
			if(min>array[a])
				min=array[a];
		}
		return min;
	}
}
