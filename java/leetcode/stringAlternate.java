package leetcode;

class Solution {
        public String mergeAlternately(String word1, String word2) {
            StringBuilder sb = new StringBuilder();
            int n1 = word1.length();
            int n2 = word2.length();
            int i = 0;
            while (i < n1 && i < n2) {
                if (i < n1) {
                    sb.append(word1.charAt(i));
                }
                if (i < n2) {
                    sb.append(word2.charAt(i));
                }
                i++;
            }
            if (i < n1) {
                sb.append(word1.substring(i));
            } else if (i < n2) {
                sb.append(word2.substring(i));
            }
            return sb.toString();
        }
    }
    
    public class stringAlternate{
        public static void main(String[] args) {
            Solution solution = new Solution();
            String word1 = "abc";
            String word2 = "defg";
            String merged = solution.mergeAlternately(word1, word2);
            System.out.println("Merged string: " + merged);
    }
}

