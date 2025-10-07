class Solution {
    public int countCharacters(String[] words, String chars) {
        int c1[]=new int[26];
        for(char c:chars.toCharArray()){
           c1[c-'a']++;
        }
        int sum=0;
        for(String x:words){
            int c2[]=new int[26];
            for(char c:x.toCharArray()){
                c2[c-'a']++;
            }
            boolean flag=true;
            
            for(int i=0;i<26;i++){
                if(c2[i]>c1[i]){
                    flag=false;
                    break;
                }
            }
            if(flag) sum+=x.length();
        }
        return sum;
    }
}