//Write a Java program to read a string and print true 
//string is a palindrome otherwise print false. 
//e.g: if string s is MADAM" print true 
//e.g: if string s is "MAD" print false
import java.util.Scanner;
public class PALLINDROMEstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub"
		String rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String a=sc.nextLine();
	     for (int i=a.length()-1;i>=0;i--) {
	    	 rev=rev+a.charAt(i);
			
			
		}
		if(a.equals(rev)) {
			System.out.println("palindrome");
			
		}
		else {
			System.out.println("not palindrome");
		}
		

	}

}
