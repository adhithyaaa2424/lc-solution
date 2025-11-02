class Solution {
    public int findMinDifference(List<String> time) {
       List<Integer> l=new ArrayList<>();
      for (String t:time) {
            int h=Integer.parseInt(t.substring(0, 2));
            int m=Integer.parseInt(t.substring(3, 5));
            l.add(h*60+m);
        }
        Collections.sort(l);

        int diff=Integer.MAX_VALUE;
        for (int i=1;i<l.size();i++) {
            diff =Math.min(diff,l.get(i)-l.get(i-1));
        }
        int first = l.get(0);
        int last = l.get(l.size() - 1);
        diff=Math.min(diff,(24*60)-(last-first));

        System.out.print(diff);
        return diff;

    }
}