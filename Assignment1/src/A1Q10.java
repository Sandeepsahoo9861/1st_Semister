import java.util.Scanner;
public class A1Q10 {

	public static void main(String[] args) {
		System.out.println("Marks for 5 subjects:");
		Scanner sc=new Scanner(System.in);
		System.out.println("Subject1");
		float a=sc.nextFloat();
		System.out.println("Subject2");
		float b=sc.nextFloat();
		System.out.println("Subject3");
		float c=sc.nextFloat();
		System.out.println("Subject4");
		float d=sc.nextFloat();
		System.out.println("Subject5");
		float e=sc.nextFloat();
	    float total=a+b+c+d+e;
		float percent=(total/100)*100;
		System.out.println("percent= "+percent);
	}

}
