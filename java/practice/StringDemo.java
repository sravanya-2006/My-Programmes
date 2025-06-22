

class StringDemo {
    public static void main(String[] args) {
        // Declare and initialize a string
        String str = "Hello, world!";
        
        // Display the original string
        System.out.println("Original String: " + str);
        
        // Length of the string
        int length = str.length();
        System.out.println("Length of the String: " + length);
        
        // Convert the string to uppercase
        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase String: " + upperCaseStr);
        
        // Convert the string to lowercase
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase String: " + lowerCaseStr);
        
        // Extract substring
        String substring = str.substring(7);
        System.out.println("Substring from index 7: " + substring);
        
        // Check if the string contains a specific substring
        boolean containsWorld = str.contains("world");
        System.out.println("Does the string contain 'world'?: " + containsWorld);
        
        // Replace a character or substring
        String replacedStr = str.replace('o', '0');
        System.out.println("String after replacing 'o' with '0': " + replacedStr);
    }
}
