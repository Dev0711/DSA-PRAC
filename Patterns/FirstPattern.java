package Patterns;

public class FirstPattern {
    static void pattern1(int N) {
        for (int raw = 1; raw <= N; raw++) {
            for (int col = 1; col <= raw; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattern1(6);
    }
}
