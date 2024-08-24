
public class Pentagonal100NoQ2b {
	public static  int getpentagonal( int n) {
	return n*(3*n-1)/2;}

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			int no=getpentagonal(i);
			System.out.println(no); 
		}
	}
	

	}



