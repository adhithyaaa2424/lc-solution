class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        Arrays.sort(letters);
        char ch='\0';
        for(int i=0;i<letters.length;i++){
            if(letters[i]>target){
                ch=letters[i];
                break;
            }
        }
        if(ch=='\0') ch=letters[0];
        return ch;
    }
}