#include <stdio.h>
#include <stdbool.h>

bool hasPairWithSum(int arr[], int n, int targetSum) {
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i] + arr[j] == targetSum) {
                return true; // Pair with the given sum found
            }
        }
    }
    return false; // No pair with the given sum found
}

int main() {
    int arr[] = {1, 4, 7, 8, 3, 9};
    int targetSum = 12;
    int size = sizeof(arr) / sizeof(arr[0]);

    if (hasPairWithSum(arr, size, targetSum)) {
        printf("Pair with sum %d exists in the array.\n", targetSum);
    } else {
        printf("No pair with sum %d found in the array.\n", targetSum);
    }

    return 0;
}
