
public class outputQuestionEndsem2023Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
		    a[i] = a[i] + i * 2;  // Corrected assignment
		    sum = sum + a[i];
		    System.out.println(a[i]);  // Corrected print statement
		}

		System.out.println(sum);

	}

}
