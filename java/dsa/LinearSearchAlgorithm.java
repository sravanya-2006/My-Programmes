package dsa;

public class LinearSearchAlgorithm {
    public static void main(String[] args) {
       int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
       int target = 19;
       int ans = linearSearch(nums, target);
       
       // Print the result
       if (ans != -1) {
           System.out.println("Element found at index: " + ans);
       } else {
           System.out.println("Element not found");
       }
    }

    

    // Search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // Run a for loop
        for (int index = 0; index < arr.length; index++) {
            // Check for element at every index
            if (arr[index] == target) {
                return index;
            }
        }
          // This line will execute if none of the return statements above has executed
          return -1;
    }

    //search the target and return the element
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

       
        for(int element : arr) {
            if (element == target) {
                return element;
            }
        }
          // This line will execute if none of the return statements above has executed
          return Integer.MAX_VALUE;
    }

    //search the target and return true or false
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        // Run a for loop
        for (int element : arr) {
            // Check for element at every index
            if (element == target) {
                return true;
            }
        }
        // This line will execute if none of the return statements above has executed
        return false;
      
    }
}
 