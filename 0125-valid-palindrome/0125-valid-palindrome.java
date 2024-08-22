class Solution {
    public boolean isPalindrome(String s) {
        String chars = s.toLowerCase().replaceAll("[^a-z0-9]","");
        
        for(int i=chars.length()-1; i>=0;i--){
            if(chars.charAt(i) != chars.charAt(chars.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}