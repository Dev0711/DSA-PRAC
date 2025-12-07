package recursion;

public class PrintNTimes {
    static int cnt = 1;

    static void print() { // recursive function
        if (cnt == 6)
            return; // checking the condition

        System.out.println(cnt);
        cnt = cnt + 1;
        print();
    }

    public static void main(String[] args) {
        print();
    }
}
