package practice;

import java.util.Arrays;

class FindMinMaxThread extends Thread {
    private int[] arr;
    private int min, max;

    public FindMinMaxThread(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        // Find minimum and maximum elements
        min = arr[0];
        max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Thread T1: Minimum = " + min + ", Maximum = " + max);
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}

class ReverseArrayThread extends Thread {
    private int[] arr;

    public ReverseArrayThread(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        // Reverse the array
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("Thread T2: Reversed Array: " + Arrays.toString(arr));
    }
}

public class Test {
    public static void main(String[] args) {
        int[] array = {5, 12, 3, 7, 9, 2};

        // Create thread T1 for finding min and max
        FindMinMaxThread T1 = new FindMinMaxThread(array);

        // Create thread T2 for reversing the array
        ReverseArrayThread T2 = new ReverseArrayThread(array);

        // Start both threads
        T1.start();
        T2.start();

        // Wait for threads to finish
        try {
            T1.join();
            T2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting.");
    }
}
