package recursion;

public class PrintNTO1 {
    static void fun(int i, int n){
        if(i<n) return;
        System.out.println(i);

        fun(i -1, n);
    }

    public static void main(String[] args) {
        int i = 4;
        int n = 10;
        fun(n,i);
    }
}
