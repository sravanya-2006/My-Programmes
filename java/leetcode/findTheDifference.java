package leetcode;

import java.util.Arrays;

class Solution {
    public char findTheDifference(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] != tArr[i]) {
                return tArr[i];
            }
        }

        return tArr[tArr.length - 1];
    }
}

public class findTheDifference {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "abcd";
        String t = "abcde";
        char c = sol.findTheDifference(s, t);
        System.out.println("The added letter is: " + c);
    }
}
