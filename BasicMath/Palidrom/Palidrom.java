package BasicMath.Palidrom;

import java.util.Scanner;

public class Palidrom {
    static boolean palidrom(int n) {
        int revNum = 0;

        int dup = n;

        while (n > 0) {
            int ld = n % 10;
            revNum = (revNum * 10) + ld;
            n = n / 10;

        }
        if (dup == revNum) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (palidrom(n)) {
            System.out.println(n + "is palidrom");

        } else {
            System.out.println(n + "is not palidrom");
        }
    }

}
