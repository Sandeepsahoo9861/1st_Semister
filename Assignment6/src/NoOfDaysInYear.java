public class NoOfDaysInYear {
    public static int noOfDaysInAyear(int n) {
        if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
            n = 366;
        } else {
            n = 365;
        }
        return n;
    }

    public static void main(String[] args) {
    	int totaldays=0;
        for (int i = 2000; i <= 2020; i++) {
            int store = noOfDaysInAyear(i);
            System.out.println("Total number of days in year " + i + " is " + store);
             totaldays=totaldays +store;
        }
        System.out.println("totaldays" + totaldays);
    }
}