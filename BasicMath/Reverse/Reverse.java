package BasicMath.Reverse;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] aStrings) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int revNum = 0;

        while (n > 0) {
            int ld = n % 10;
            revNum = (revNum * 10) + ld;
            n = n / 10;

        }
        System.out.println(revNum);
    }
}
