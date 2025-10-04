class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
            int w=r-l;
            int min=Math.min(height[l],height[r]);
                max=Math.max(max,min*w);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        
       return max;
      }
}