import java.util.Scanner;
public class AregularPolynomialQ5 {
	public static double nsidedpolygonial(int n,double s) {
		double Area=((n *s*s)/(4*Math.tan(Math.PI/n)));
		return Area;
				
	}
	 
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" To find area ");
		System.out.println("enter the angle");
		int k=sc.nextInt();
		
		System.out.println( "enter the side length");
		double j=sc.nextInt();
		double store= nsidedpolygonial(k,j);
		System.out.println("area" + store);
		
		
		

	}

}
