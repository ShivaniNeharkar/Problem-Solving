import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp= new HashMap<>();
            for(String word: strs)
            {
                char[] chars = word.toCharArray();
                Arrays.sort(chars);
                String newChars = new String(chars);
                if(!mp.containsKey(newChars)){
                    mp.put(newChars,new ArrayList<>());
                }
                mp.get(newChars).add(word);
            }
        return new ArrayList<>(mp.values());
    }

}