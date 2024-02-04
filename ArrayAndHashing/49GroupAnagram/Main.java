// Given an array of strings strs, group the anagrams together. You can return the answer in any order.
// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

// Example 1:
// Input: strs = ["eat","tea","tan","ate","nat","bat"]
// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
// Example 2:
// Input: strs = [""]
// Output: [[""]]
// Example 3:
// Input: strs = ["a"]
// Output: [["a"]]

//Author :Shivani Neharkar
//Date : 3 Feb 2024


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
