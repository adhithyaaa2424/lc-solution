class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        List<HashSet<String>> var=new ArrayList<>();
        for(int i=0;i<responses.size();i++){
            HashSet<String> ans=new HashSet<>();
              List<String> val=responses.get(i);
              for(String num:val){
                 ans.add(num);
              }
              var.add(ans);
        } 
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<var.size();i++){
            HashSet<String> n=var.get(i);
            for(String num:n){
               map.put(num,map.getOrDefault(num,0)+1);
            }
        }
        int min=Integer.MIN_VALUE;
        for(String num:map.keySet()){
           int freq=map.get(num);
           min=Math.max(min,freq);
        }
        ArrayList<String> vv=new ArrayList<>();
        for(String num:map.keySet()){
           int freq=map.get(num);
           if(freq==min){
              vv.add(num);  
           }
        }
         String largest = vv.get(0);
        
        for (int i = 1; i < vv.size(); i++) {
            if (vv.get(i).compareTo(largest) <0) {
                largest = vv.get(i);
            }
        }
        return largest;
    }
}