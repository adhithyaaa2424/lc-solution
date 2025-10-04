class Solution {
    public int maxArea(int[] height) {
        int count=0;
        int left=0,right=height.length-1;
        while(left<right){
            if(height[left]<=7){
              count++;
              left++;
            
            }
            else if(height[right]<=7){
                count++;
                right--;
               }
               left++;
               right--;
            
        }
        int res=count*count;
        return res;
    }
}