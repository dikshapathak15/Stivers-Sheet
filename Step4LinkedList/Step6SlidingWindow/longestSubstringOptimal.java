package Step4LinkedList.Step6SlidingWindow;

import java.util.Arrays;

public class longestSubstringOptimal {
    public  static int largestSubstring(String s){
          int n = s.length();
          int[] hash = new int[256];
          Arrays.fill(hash, -1);
          int l = 0, r = 0, maxLength = 0;

          while(r < n){
               if (hash[s.charAt(r)] >= l) {
                l = Math.max(hash[s.charAt(r)] + 1, l); //move the left pointer to the right of the last occurence of s.charAt(r)
               }

               int length = r - l + 1;
               maxLength = Math.max(maxLength, length);

               hash[s.charAt(r)] = r;
               r++;
          }

          return maxLength;

    }
    public static void main(String[] args) {
          String s = "bacdeabb";
        int result = largestSubstring(s);
        System.out.println("Largest possible substring without repetition is: " + result);
    }
}
//tc = 0(n) sc  = 0(256)