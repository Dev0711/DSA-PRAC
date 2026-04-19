package Sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort2 {

    public static void mergeSort(int[] arr, int startIndex, int endIndex){
        if(startIndex>= endIndex){
            return;
        }

        int mid = (startIndex + endIndex) / 2;
        mergeSort(arr, startIndex, mid);
        mergeSort(arr, mid+1, endIndex);
        merge(arr, startIndex, mid, endIndex);

    }

    public static void merge(int[] arr, int startIndex, int mid, int endIndex){
        List<Integer> temp = new ArrayList<>();

        int leftPointer = startIndex;
        int rightPointer = mid + 1;

        while(leftPointer<= mid && rightPointer<=endIndex){ // whole loop from low to right.
            if(arr[leftPointer]<= arr[rightPointer]){
                temp.add(arr[leftPointer++]);
            }
            else {
                temp.add(arr[rightPointer++]);
                }
            }
        while(leftPointer <= mid){
            temp.add(arr[leftPointer++]);
        }
        while(rightPointer<= endIndex){
            temp.add(arr[rightPointer++]);
        }
        for(int i = startIndex; i<= endIndex; i++){
            arr[i]= temp.get(i - startIndex);
        }




    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 1};
        mergeSort(arr, 0, arr.length - 1);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
}
