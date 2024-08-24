import java.util.Scanner;
public class SpecificcharacterOccuranceQ6 {
	public static int searchcaracter(String n, char p) {
	int count=0;
	for (int i=0;i<n.length();i++) {
		if (n.charAt(i)==p)
			count=count +1;
	}
	return count;
     }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String input=sc.nextLine();
	     System.out.println("enter the character");
	     char search=sc.next().charAt(0);
	     int occurance=searchcaracter(input,search);
		System.out.println( "occurance of search" + occurance);
		
				

	}

}
