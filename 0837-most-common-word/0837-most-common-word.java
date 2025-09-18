class Solution {
    public String mostCommonWord(String s, String[] s1) {
         String str = s.toLowerCase().replaceAll("[^a-zA-Z]", " ");
     String[] words = str.split("\\s+");
        
        Set<String> set = new HashSet<>(Arrays.asList(s1));
        Map<String, Integer> wordCount = new HashMap<>();
        
        for (String word : words) {
            if (!word.isEmpty() && !set.contains(word)) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        String result = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                result = entry.getKey();
            }
        }
        
        return result;
    }
}