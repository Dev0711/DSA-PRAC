package BasicMath.FindAllDivisors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BrFindAllDivisors {
    public static List<Integer> printDivisors(int N) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                ans.add(i);

            }

        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> result = printDivisors(n);
        System.out.println(result);
    }
}
