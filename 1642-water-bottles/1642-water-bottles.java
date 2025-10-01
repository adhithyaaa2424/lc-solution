class Solution {
    public int numWaterBottles(int bottle, int ex) {

         int b2=bottle;
         int sum=0;
		while(b2>=ex){
		   int q=b2/ex;
		   int rem=b2%ex;
		   sum= sum+q;
		   b2=rem+q;
		}
        return sum+bottle;
    }
}