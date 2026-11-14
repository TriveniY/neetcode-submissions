class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int i =0;
        int j = n-1;
        while(i<j){
            if(isAlphaNumeric(s.charAt(i)) && isAlphaNumeric(s.charAt(j))){
                if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))){
                    i++;
                    j--;
                }else{
                    return false;
                }
            }else if (!isAlphaNumeric(s.charAt(i))){
                i++;
            }else if(!isAlphaNumeric(s.charAt(j))){
                j--;
            }
        }
        return true;
    }
    public boolean isAlphaNumeric(Character ch){
        //return ch-'A'>=0 && ch-'A'<=25 || ch-'a'>=0 && ch-'a'<= 25 || ch-'0'>=0 && ch-'0'<=9;
        return Character.isLetterOrDigit(ch);
    }
}
