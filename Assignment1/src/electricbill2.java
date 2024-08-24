import java.util.Scanner;
public class electricbill2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter unit = ");
		int unit = sc.nextInt();
		double bill;
		if (unit<=50) {
			bill=unit*3;
		}
		else if(unit<=200) {
			bill=(50*3)+(unit-50)*4.80;
		}
		else if(unit<=400) {
			bill=(50*3)+(150*4.8)+(unit-200)*5.80;
		}
		else {
			bill=(50*3)+(150*4.80)+(200*5.80)+(unit-400)*6.20;}
		
		System.out.println(" the BiLL is" + " " +bill);
	}
}

	