 
public class commandlineRiseToThePowerSecQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base=Integer.parseInt(args[0]);
        int exponet=Integer.parseInt(args[1]);
        double result=Math.pow(base,exponet);
        System.out.println(base +"raised to the power of" + exponet+ "is" + result);
	}

}
