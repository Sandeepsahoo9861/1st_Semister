//If "HOUSE" is coded as 35842, and "LEMON" is coded as 12659, then what would be the code for "HELEN"? 32129 Write the java statements for the above problem

import java.util.Scanner;
public class HELLEN1{

  public static void main(String[] args) {
    // TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string: ");
String s=sc.nextLine();
		int code = 0;
        for (int i=0; i<s.length(); i++) {
            char letter=s.charAt(i);
            
            switch (letter) {
                case 'H':
                    code =  3;
                    break;
                case 'O':
                    code = 5;
                    break;
                case 'U':
                    code = 8;
                    break;
                case 'S':
                    code = 4;
                    break;
                case 'E':
                    code = 2;
                    break;
                case 'L':  
                    code = 1;
                    break;
                case 'M':
                    code = 6;
                    break;
                case 'N':
                    code = 9;
                    break;
                default:
                    break;
            }
            System.out.print(code);
        }

  }

}