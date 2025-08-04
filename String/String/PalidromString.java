package String;

public class PalidromString {

    public static void main(String[] args) {
        String str = "";
        System.out.println(isPlaidrom(str));
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
        return false;
    }
}