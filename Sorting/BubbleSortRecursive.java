package Sorting;

public class BubbleSortRecursive {
    public static void bubbleSortRecursive(int[] arr, int n){
        if(n==1){
            return;
        }

        for(int j = 0; j< n-1; j++){
            if (arr[j] > arr[j+1]) {
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }

        bubbleSortRecursive(arr, n -1);

    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2, 9};

        int n = arr.length;
        System.out.println("before sorting");
        for(int num: arr){
            System.out.print(num + " ");
        }

        bubbleSortRecursive(arr,n);

        System.out.println("after sorting");
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}
