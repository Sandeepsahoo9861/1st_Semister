
public class Lbrake {

	public static void main(String[] args) {
		out:
		
			for (int i=0;i<=2;i++)
			{
				for (int j=0;j<=2;j++)
				{if (i==1  && j==1)
					break out;
				System.out.println(i+"" +j);
				}
			}
		

	}

}
