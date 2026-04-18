package Sorting;

public class MergeSort {

    public static void mergeSort(int[] arr){
      if(arr == null || arr.length < 2){
          return;
      }
      // new array which is same length of the original array
      int[] temp = new int[arr.length];
      mergeSortHelper(arr, temp,0, arr.length-1);

    }

    public static void mergeSortHelper(int[] arr, int[] temp, int left, int right){
        if(left>= right){
            return;
        }

        int mid = left + (right -left) /2;

        mergeSortHelper(arr,temp,left,mid); // sort left
        mergeSortHelper(arr,temp, mid+1, right); //sort right
        merge(arr,temp, left, mid, right); // then merge

    }

    public static void merge(int[]arr, int[] temp, int left, int mid, int right){
        for(int i = 0; i<= arr.length - 1;i++){
            temp[i]= arr[i];
        }

        int i = left;
        int j= mid+1;
        int k = left;

        while(i <= mid && j <= right){
            if(temp[i]<= temp[j]){
                arr[k] = temp[i];
                i++;

            }
            else {
                arr[k] = temp[j];
                j++;
            }
            k++;

        }

        while(i<= mid){
            arr[k] = temp[i];
            i++;
            k++;
        }

    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original array:");
        printArray(arr);

        mergeSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
