class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> l=new ArrayList<>();
        int arr[]=new int[2];
        for(int k:map.keySet()){
            if(map.get(k)==2) l.add(k);
        }
        for(int i=0;i<l.size();i++){
            arr[i]=l.get(i);
        }
        System.out.print(l);
        return arr;
    }
}