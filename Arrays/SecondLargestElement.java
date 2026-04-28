package Arrays;

import java.util.Arrays;
import java.util.function.DoubleToIntFunction;

public class SecondLargestElement {
    public static void getElements(int[] arr, int n) {

        // Edge case: when the array has less than 2 elements
        if (n == 0 || n == 1) {
            System.out.println(-1 + " " + -1);  // Print -1 for both second smallest and second largest
            return;
        }

        // Sort the array to easily find the second smallest and second largest elements
        Arrays.sort(arr);

        // Second smallest element is at index 1 after sorting
        int small = arr[1];

        // Second largest element is at index n-2 after sorting
        int large = arr[n - 2];

        // Output the second smallest and second largest elements
        System.out.println("Second smallest is " + small);
        System.out.println("Second largest is " + large);
    }

    public static void getElemnetsOptimal(int[] arr, int n){
//        if(n==0 || n ==1){
//            System.out.println();
//            return;
//        }

        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_small = Integer.MAX_VALUE;
        int second_large = Integer.MIN_VALUE;

        for(int i=0; i< n; i++) {
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }

        for(int i = 0; i< n; i++){
            if(arr[i]<second_small && arr[i] != small){
                second_small = arr[i];
            }
            if(arr[i]> second_large && arr[i] != large){
                second_large = arr[i];
            }
        }

        System.out.println("second largest: "+ second_large);
        System.out.println("second small "+ second_small);

    }
    public static void main(String[] args) {
        // Initialize the array with elements
        int[] arr = {1, 2, 4, 6, 7, 5};

        // Calculate the size of the array
        int n = arr.length;

        // Call the method to find and print the second smallest and second largest elements
//        SecondLargestElement.getElements(arr, n);
        SecondLargestElement.getElemnetsOptimal(arr, n);
    }

}
