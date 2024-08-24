public class patternquestion {

    public static void main(String[] args) {
        int k = 5;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= (k - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}