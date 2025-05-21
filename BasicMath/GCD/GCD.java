package BasicMath.GCD;

import java.util.Scanner;

public class GCD {
    public static int findGcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;

        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int result = findGcd(n1, n2);
        System.out.println("GCD of " + n1 + " and " + n2 + " is :" + result);

    }
}
