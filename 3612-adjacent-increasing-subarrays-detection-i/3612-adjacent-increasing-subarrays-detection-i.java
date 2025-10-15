class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> list, int k) {
        if(k==1) return true;
        for(int i=0;i<=list.size()-(k+k);i++)
        {
            int m=i+k;
            boolean flag=true;
            for(int j=1;j<k;j++)
            {
                if(list.get(i+j)<=list.get(i+j-1))
                {
                    flag=false;
                    break;
                }
                if(list.get(m+j)<=list.get(m+j-1))
                {
                    flag=false;
                    break;
                }
            }
            if(flag==true) return true;
        }
        return false;
        
    }
}