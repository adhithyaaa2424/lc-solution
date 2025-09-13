class Solution {
    public int maxFreqSum(String s) {
        
        String v="";
        String c="";
        for(int i=0;i<s.length();i++){
            if("aeiouAEIOU".indexOf(s.charAt(i))!=-1){
                v+=s.charAt(i);
            }
            else{
                c+=s.charAt(i);
            }
        }
         int sum=0;
       Map<Character,Integer> map1=new HashMap<>();
       for(char ch:v.toCharArray()){
           map1.put(ch,map1.getOrDefault(ch,0)+1);
       }
       int max1=0;
       for(int key:map1.values()){
           max1=Math.max(max1,key);
       }
               sum+=max1;
               
           
            Map<Character,Integer> map2=new HashMap<>();
       for(char ch:c.toCharArray()){
           map2.put(ch,map2.getOrDefault(ch,0)+1);
       }
       int max2=0;
       for(int key:map2.values()){
           max2=Math.max(max2,key);
       }
               sum+=max2;
               return sum;
    }
}