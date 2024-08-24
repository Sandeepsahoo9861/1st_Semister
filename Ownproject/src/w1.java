import java.util.Scanner;
public class w1 {
public static int count(String str)
{
int c=0;
for (int i = 0; i < str.length(); i++) {
 if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
 || str.charAt(i) == 'i'
 || str.charAt(i) == 'o'
 || str.charAt(i) == 'u') {
 
 c++;
 }
 }
return c;
}
public static void main(String[] args) {
Scanner ob = new Scanner(System.in);
System.out.print("Enter the String: ");
String s=ob.nextLine();
int c=count(s);
System.out.println("Total no of vowels are: "+c);
}
}
