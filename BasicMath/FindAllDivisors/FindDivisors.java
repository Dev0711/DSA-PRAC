package BasicMath.FindAllDivisors;

import java.util.ArrayList;
import java.util.Scanner;

public class FindDivisors {
    public static ArrayList<Integer> findDivisors(int N) {
        ArrayList<Integer> divisors = new ArrayList<>();

        int sqrtN = (int) Math.sqrt(N);
        for (int i = 1; i <= sqrtN; i++) {
            if (N % i == 0) {
                divisors.add(i);
            }
            if (i != N / i) {
                divisors.add(N / i);
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> divisors = findDivisors(num);

        System.out.println("Divisors" + num + "are:");
        for (int divisor : divisors) {
            System.out.println(divisor + " ");

        }
        System.out.println();
    }

}
