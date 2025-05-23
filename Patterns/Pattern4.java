package Patterns;

class Pattern4 {
    static void pattern4(int N) {
        for (int i = 0; i < 2 * N; i++) {
            int totlaColInRow = i > N ? 2 * N - i : i;
            for (int j = 0; j < totlaColInRow; j++) {
                System.out.println("* ");

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        pattern4(5);
    }
}