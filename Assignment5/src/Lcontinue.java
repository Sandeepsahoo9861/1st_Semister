
public class Lcontinue {

	public static void main(String[] args) {
		L1:
		for (int i=0;i<=2;i++)
		{
			for (int j=0;j<=2;j++) {
				if (i==1 && j==1)
					continue L1;
				System.out.println(i+"" +j);
				
			}
		}
	

	}

}
