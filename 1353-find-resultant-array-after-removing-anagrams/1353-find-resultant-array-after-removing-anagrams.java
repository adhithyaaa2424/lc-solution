class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> l=new ArrayList<>();
        l.add(words[0]);
        String pre=sort(words[0]);
        for(int i=1;i<words.length;i++){
        String curr=sort(words[i]);
        if(!curr.equals(pre))
        l.add(words[i]);
        pre=curr;

        }
        return l;
    }
    public String sort(String s){
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}