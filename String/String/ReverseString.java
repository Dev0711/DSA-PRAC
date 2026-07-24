package String;

public class ReverseString {
    public String reverseString(String s){
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length -1;

        while (left< right){
             char temp = ch[left];
             ch[left] = ch[right];
             ch[right] = temp;

             left ++;
             right --;
        }
        return new String(ch);

    }

    public static void main(String[] args) {
        String s = "abcd";
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverseString(s));
    }
}
