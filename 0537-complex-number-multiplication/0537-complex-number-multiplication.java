class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String sp1[]=num1.split("\\+|i");
        String sp2[]=num2.split("\\+|i");
        int ar=Integer.parseInt(sp1[0]);
        int ai=Integer.parseInt(sp1[1]);
        int br=Integer.parseInt(sp2[0]);
        int bi=Integer.parseInt(sp2[1]);

        int real=ar*br-ai*bi;
        int imaginary=ar*bi+ai*br;
        
        return real+"+"+imaginary+"i";


    }
}