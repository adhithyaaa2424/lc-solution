class Solution {
    public String licenseKeyFormatting(String s, int k) {
      String str="";
		for(int i=s.length()-1;i>=0;i--){
		   if(s.charAt(i)!='-') str+=s.charAt(i);
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++){
		   if(i%k==0) {
		      sb.append('-');
		      sb.append(str.charAt(i));

		   }
		   else {
		      sb.append(str.charAt(i));
		}
		}
		String res="";
		for(int i=sb.length()-1;i>0;i--){
		   res+=sb.charAt(i);
		}
        return res.toUpperCase();  
    }
}