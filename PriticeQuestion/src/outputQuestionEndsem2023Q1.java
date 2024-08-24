
public class outputQuestionEndsem2023Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte y = 15, z = (byte) -y;
		System.out.println(~y);
		System.out.println(~z);

		y &= ~y;
		System.out.println(y >> 2);
		byte x = -11;
		System.out.println(x >>> 28);

	}

}
