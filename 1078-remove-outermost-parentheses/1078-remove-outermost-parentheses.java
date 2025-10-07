class Solution {
    public String removeOuterParentheses(String s) {
        int c = 0;
        StringBuilder sb=new StringBuilder();
       for (char ch : s.toCharArray()) {
            if (ch =='(') {
                if (c>0) sb.append(ch); 
                c++;
            } else {
                c--;
                if (c>0) sb.append(ch); 
            }
        }
        return sb.toString();
    }
}