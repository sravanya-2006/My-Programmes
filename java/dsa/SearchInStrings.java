package dsa;
import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "sravanya";
        char target = 'a';
        // System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for(char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false; // If we reach this point, the target was not found
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true; // Found the target, return true
            }
        }
        return false; // If we reach this point, the target was not found
    }
}

