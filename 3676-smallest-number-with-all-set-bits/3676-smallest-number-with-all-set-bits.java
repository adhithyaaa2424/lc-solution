class Solution {
    public int smallestNumber(int n) {
        String s=Integer.toBinaryString(n);
        String toggle=s.replaceAll("0","1");
        return Integer.parseInt(toggle,2);
    }
}