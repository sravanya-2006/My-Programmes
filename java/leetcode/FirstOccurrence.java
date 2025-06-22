package leetcode;
import java.util.*;

class Solution {
    public char indexOfFirstString(String a, String b) {
        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        Arrays.sort(aArr);
        Arrays.sort(bArr);
        int minLength = Math.min(aArr.length, bArr.length);
        for (int i = 0; i < minLength; i++) {
            if (aArr[i] == bArr[i]) {
                return aArr[i];
            }
        }
        // If no matching character found, you might want to return something meaningful.
        // For now, let's return '\0', which indicates null character.
        return '\0';
    }
}

public class FirstOccurrence {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String a = "my name is sravanya";
        String b = "srava";
        char c = sol.indexOfFirstString(a, b);
        System.out.println("First occurrence: " + c);
    }
}

package leetcode;
import java.util.*;

class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        
        for (int i = 0; i <= haystackLength - needleLength; i++) {
            int j;
            for (j = 0; j < needleLength; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == needleLength) {
                return i;
            }
        }
        
        return -1;
    }
}

public class FirstOccurrence {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String haystack = "my name is sravanya";
        String needle = "srava";
        int index = sol.strStr(haystack, needle);
        if (index != -1) {
            System.out.println("First occurrence found at index: " + index);
        } else {
            System.out.println("Needle not found in haystack.");
        }
    }
}


