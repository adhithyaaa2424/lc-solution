class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder(s);
	   int l=0;
	   int r=1;
	   while(r<sb.length()){
	      if(sb.charAt(l)==sb.charAt(r)){
	         sb.deleteCharAt(r);
	         sb.deleteCharAt(l);
	      if(l>0){
	         
	      l--;
	      r--;
	      }
	      }
	      else{
	      l++;
	      r++;
	   
	   }
	   }
       return sb.toString();
    }
}