package Sorting;

public class QuickSort {
    public static void quicksort(int[] arr, int low, int high){
       if(low < high){
           int pivotIndex = partition(arr,low,high);
           quicksort(arr,low,pivotIndex - 1);
           quicksort(arr,pivotIndex+1, high);
       }


    }
    public static int partition(int[] arr, int low, int high) {
        int pivotvalue = arr[high];

        // partitionIndex tracks the position where next smaller element should go
        // Initially -1 because we haven't found any smaller elements yet

        int partitionIndex = low - 1;

        for (int currentvalue = low; currentvalue < high; currentvalue++) { // from low to high
            if (arr[currentvalue] <= pivotvalue) {
                partitionIndex++;    //
                int temp = arr[partitionIndex];
                arr[partitionIndex] = arr[currentvalue];
                arr[currentvalue] = temp;

            }


        }
        int temp = arr[partitionIndex + 1];
        arr[partitionIndex + 1] = arr[high];
        arr[high] = temp;

        return partitionIndex + 1;
    }

        public static void printArray(int[] array) {
            for (int element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int[] numbers = {10, 7, 8, 9, 1, 5};

            System.out.println("Original array:");
            printArray(numbers);

            quicksort(numbers, 0, numbers.length - 1);

            System.out.println("Sorted array:");
            printArray(numbers);
        }

}
