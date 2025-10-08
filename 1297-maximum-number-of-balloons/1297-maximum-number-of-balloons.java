class Solution {
    public int maxNumberOfBalloons(String text) {
        int fre[]=new int[26];
        for(char c:text.toCharArray()){
            fre[c-'a']++;
        }
        int b =fre['b'-'a'];
        int a =fre['a'-'a'];
        int l =fre['l'-'a']/2;
        int o =fre['o'-'a']/2;
        int n =fre['n'-'a'];

        return Math.min(Math.min(Math.min(Math.min(b, a), l), o), n);
    }
}