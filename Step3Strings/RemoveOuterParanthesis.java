package Step3Strings;

public class RemoveOuterParanthesis {
    public static String removeOuterParanthesis(String s){
        int n = s.length();
        int cnt = 0;
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < n ; i ++){
            if(s.charAt(i) == ')'){
                cnt--;
            }
            if(cnt != 0){
                ans.append(s.charAt(i));
            }
            if(s.charAt(i) == '('){
                cnt++;
            }
        }
        return ans.toString();

    }
    public static void main(String[] args) {
        String input = "((P1)+(P2))((P3))(P4+P5)";
        System.out.println("The removed outer paranthesis are: " + removeOuterParanthesis(input));
    }
}
//tc = 0(n) we have to to go through every character in the string at once
//sc = 0(n) extra space ans as a stringbuilder