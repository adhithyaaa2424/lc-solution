class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char c[]=jewels.toCharArray();
        char c1[]=stones.toCharArray();
        int count=0;
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c1.length;j++){
                if(c[i]==c1[j]) count++;
            }
        }
        return count;            
        }
    
}