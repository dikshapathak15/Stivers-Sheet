package Step4LinkedList.Step6SlidingWindow;

import java.util.Arrays;
import java.util.HashMap;

public class longestSubstringwithourRepeatition {
    public  static int largestSubstring(String s){
        int n = s.length();
        int maxLength = 0;

        for(int i = 0; i < n ; i++){
            int[] hash = new int[256];
            Arrays.fill(hash, 0);
            for(int j = i ; j < n ; j++){
                if (hash[s.charAt(j)] == 1) {
                    break;
                }
                 hash[s.charAt(j)] = 1;
                int length = j- i + 1;
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "bacdabb";
        int result = largestSubstring(s);
        System.out.println("Largest possible substring without repetition is: " + result);
    }
}
//tc = 0(n^2) and space complexity = 0(256) for hash array
