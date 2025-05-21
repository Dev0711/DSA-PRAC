package countDigit;

import java.util.Scanner;

public class countDigit {
    public static int countDigit(int n) {
        int cnt = 0;

        while (n > 0) {
            cnt = cnt + 1;
            n = n / 10;

        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println("N" + n);
        int digits = countDigit(n);
        System.out.println("Number of digits " + digits);

    }

}
