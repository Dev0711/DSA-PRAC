package recursion;

public class Print1ToN {
    static void function(int i , int n){

        if(i>n ) return;   // checking the condition here where i>n tab tak print karana hai nahi to return
        System.out.println(i);

        function(i+1, n);  // increment by each iteration

    }

    public static void main(String[] args) {
        int i = 2;
        int n = 65;
        function(i, n);

    }
}
