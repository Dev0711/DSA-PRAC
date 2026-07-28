package String;

public class ReverseStringIII {
    public static String reverseWords(String s){
        char[] words = s.toCharArray();
        int start = 0;

        for(int end = 0; end <= words.length; end++){
            if(end == words.length || words[end] == ' '){
                reverse(words, start, end -1);
                start = end +1;

            }

        }
        return new String(words);
    }
    private static void reverse(char[] words, int left, int right){
       while(left< right){
           char temp = words[left];
           words[left] = words[right];
           words[right] = temp;

           left++;
           right--;

       }


    }

    public static void main(String[] args) {
        String s = "this is my name";
        String result = reverseWords(s);
        System.out.println(result);


    }
}
