public class StringMethods {
    public static void main(String[] args) {
        
        String s1 = "Java is objected oriented language";
        String s2 = "C++ is also object oriented language";

        String concatenated = s1.concat(s2);
        System.out.println("Concatenated string: " + concatenated);

        System.out.println("Size of s1: " + s1.length());
        System.out.println("Size of s2: " + s2.length());
  
        s1 = s1.replace("object oriented", "program");
        System.out.println("Modified s1: " + s1);

        int location = s2.indexOf("lang");
        System.out.println("Location of 'lang' in s2: " + location);

        String replacedVowels = s1.replaceAll("[aeiouAEIOU]", "X");
        System.out.println("s1 with vowels replaced: " + replacedVowels);
    }
}

