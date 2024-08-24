import java.util.Scanner;
public class w {
public static int count(String str, char a)
{
int c = 0; 
 for (int i=0; i<str.length(); i++)
 {
 if (str.charAt(i) == a)
 c=c+1;
 } 
 return c;
}
public static void main(String[] args) {
Scanner ob = new Scanner(System.in);
System.out.print("Enter the String: ");
String s=ob.nextLine();
System.out.print("Enter the character you want to search:");
char ch=ob.next().charAt(0);
int c=count(s, ch);
System.out.println(ch+" is present "+c+"times in \""+s+"\"");
}
}
