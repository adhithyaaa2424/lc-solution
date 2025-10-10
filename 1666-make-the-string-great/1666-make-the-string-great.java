class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(!st.isEmpty()&&Character.toLowerCase(st.peek())==Character.toLowerCase(c)&&st.peek()!=c){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        return sb.toString();
    }
}