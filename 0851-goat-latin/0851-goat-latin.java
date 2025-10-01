class Solution {
    public String toGoatLatin(String s) {
        String sp[]=s.split(" ");
	   StringBuilder sb=new StringBuilder();
	   for(int i=0;i<sp.length;i++){
	      String sub=sp[i].substring(0,1);
	      if("[aeiouAEIOU]".indexOf(sub)!=-1){
	         sb.append(sp[i]);
	      }
	      else{
	         sb.append(sp[i].substring(1));
	         sb.append(sub);
	      }
	      sb.append("ma");
	   
	   for(int j=0;j<=i;j++){
	      sb.append("a");
	   }
	   if(i<sp.length-1) sb.append(" ");
	}
    return sb.toString();
    }
}