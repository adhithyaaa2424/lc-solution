class Solution {
    public boolean judgeCircle(String s) {
        int a=0,b=0;
        for(char c:s.toCharArray()){
            if(c=='U') a++;
            else if(c=='D') a--;
            else if(c=='L') b--;
            else b++;
        }
        return a==0 && b==0;
    }
}