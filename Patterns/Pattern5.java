package Patterns;

public class Pattern5 {

    static void pattern5(int n) {
        for (int row = 1; row <= n; row++) {

            for (int spaces = 0; spaces < n - row; spaces++) {
                System.out.println(" ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col);

            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattern5(5);
    }

}
