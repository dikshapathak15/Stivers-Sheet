package Step3Strings;

public class ReverseWordsInaString {
    public static String reverseWords(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        StringBuilder sb = new StringBuilder(s); // Reverse the entire string
        sb.reverse();
        s = sb.toString();

        for (int i = 0; i < n; i++) {
            StringBuilder word = new StringBuilder();
            while (i < n && s.charAt(i) != ' ') {
                word.append(s.charAt(i));
                i++;
            }
            word.reverse();

            if (word.length() > 0) {
                ans.append(" ").append(word);
            }

        }
        return ans.toString().trim();
    }
    public static void main(String[] args) {
        String input = " is blue";
        System.out.println("The reversed word of the string is: " + reverseWords(input));
    }
}
