import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s= new Solution();
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        ;
        List<List<String>> result = s.groupAnagrams(strs);

        // Print the result
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}