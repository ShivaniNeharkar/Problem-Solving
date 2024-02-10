class Solution {
    public boolean isPalindrome(String s) {
        String newString;
        newString=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        for(int i=0;i<newString.length()/2;i++)
        {
            if(newString.charAt(i)!=newString.charAt(newString.length()-1-i)){
                return false;
            }
        }
            return true;
        }
    
}
