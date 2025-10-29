class Solution {
    public int diagonalPrime(int[][] mat) {
        int n=mat.length;
		  List<Integer> l=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
                l.add(mat[i][i]);
                l.add(mat[i][n-1-i]);
            }
            List<Integer> res=new ArrayList<>();
        for(int i=0;i<l.size();i++){
           if(isprime(l.get(i))){
             res.add(l.get(i));
           }
        }
        Collections.sort(res);
        if(res.isEmpty()) return 0;
        return res.get(res.size()-1);
    }
    public static boolean isprime(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    
    }
}