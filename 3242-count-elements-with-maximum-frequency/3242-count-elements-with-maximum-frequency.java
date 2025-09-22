class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int max=0;
        for(int k:map.values()){
            max=Math.max(max,k);
        }
        int total=0;
        for(int fre:map.values()){
            if(fre==max) total+=fre;
        }
        return total;
    }
}