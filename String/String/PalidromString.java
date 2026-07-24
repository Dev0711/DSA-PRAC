package String;

public class PalidromString {

    public static void main(String[] args) {
        String str = "abcba";
        System.out.println(isPlaidrom(str));
        System.out.println(isPalidrom2(str));
    }

    static boolean isPlaidrom(String str) {
        str = str.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }

        }
        return true;
    }

    static boolean isPalidrom2(String s){
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length - 1;

        while(left < right){
            if(ch[left] != ch[right]){
                return false;
            }
            left++;
            right--;
        }
       return true;
    }

}

