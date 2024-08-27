class Solution {
    public int lengthOfLastWord(String s) {
        int lastlength = s.length();
        int count =0;
        int i=lastlength-1;
         
         while(i>=0 && s.charAt(i) == ' '){
            i--;
         }

         while(i>=0 && s.charAt(i) != ' '){
            count++;
            i--;
         }
         return count;
       
    }
}