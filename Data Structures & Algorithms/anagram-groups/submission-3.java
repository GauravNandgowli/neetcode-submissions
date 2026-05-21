class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int [] tuple = new int[26];
            for(char c : s.toCharArray()){
                tuple[c - 'a']++;
            }            
            String key = Arrays.toString(tuple);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
            
        }

        return new ArrayList<>(map.values());
    }
}