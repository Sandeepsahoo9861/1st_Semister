import java.util.Scanner;
public class PalindromNoQ3 {
	public static int getpalindrome(int no) {   
	int rev =0;
	int rem;
	 while (no!= 0)
	{ rem=no % 10;
	
	rev=rev*10 + rem;
	 no=no /10;
	 }
	 System.out.println("rever number is"+ rev);
	return rev;
	}
	public static void main(String[] args) {
		System.out.println("enter the number to check palindrome no ");
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		
		int palindrom= getpalindrome(k);
		if (k== palindrom ) {
			System.out.println( " yes it is a palindrome no");
		}else {
				System.out.println("no it is not a palindrome no");
			
		}
		

	}

}
