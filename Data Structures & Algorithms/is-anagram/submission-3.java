class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character,Integer> map = new HashMap<>();
        for(int i =0 ; i< t.length();i++){
            map.merge(t.charAt(i), 1 , Integer::sum);
        }

        for(int i = 0 ; i< s.length(); i++){
            map.computeIfPresent(s.charAt(i), (k, v)-> v==0? null: v-1);
            if(map.get(s.charAt(i)) == null ) return false;
        }

        return true;

    }
}
