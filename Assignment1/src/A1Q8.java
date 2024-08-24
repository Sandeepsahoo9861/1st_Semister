import java.util.Scanner;
public class A1Q8 {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		 System.out.println("Enter the word");
		 String a=Sc.next();
		 char ch=a.charAt(0);
		 if(ch>='A' && ch<='Z')
		 {
			 ch=(char)(ch +32);
		 }
		 if (ch=='a' || ch=='i' || ch=='e' || ch=='o' || ch=='u')
		 {
			 System.out.println("an" +" "+a);
		 }
		 else
			 System.out.println("a"+ " "+a);

	}

}
