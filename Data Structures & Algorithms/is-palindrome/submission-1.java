class Solution {
    public boolean isPalindrome(String s) {
        String newStr = "";
        for (int k = 0; k< s.length(); k++) {
            if ((s.charAt(k) >= 'a' && s.charAt(k) <= 'z') || (s.charAt(k) >= 'A' && s.charAt(k) <= 'Z') || (s.charAt(k) >= '0' && s.charAt(k) <= '9')) {
                newStr += s.charAt(k);
            }
        }
        newStr = newStr.toLowerCase();
        int i = 0;
        int j = newStr.length() - 1;
        while (i <= j) {
            if (newStr.charAt(i) != newStr.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true; 
    }
}
