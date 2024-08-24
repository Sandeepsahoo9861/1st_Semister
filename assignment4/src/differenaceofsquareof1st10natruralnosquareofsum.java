
public class differenaceofsquareof1st10natruralnosquareofsum {

	public static void main(String[] args) {
		int k=0, sumsquare;
		for(int i=1;i<=10;i++) {
			k= k + i*i;
		
		}
		System.out.println("sum of first 10 natural no is "+k);
		sumsquare=k*k;
		System.out.println("sum of square is"+sumsquare);
		System.out.println("there difference is" + (sumsquare -k));

	}

}
