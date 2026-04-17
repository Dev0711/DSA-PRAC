package Sorting;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for(int i = 0 ; i < n -1; i++){
            int minindex = i;// assume current is minimal

            for(int j = i+1; j< n; j++){
                if(arr[j]< arr[minindex] ){
                    minindex = j;
                }
            }
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;

        }

        System.out.println("after sorting");
        for(int num : arr){
            System.out.println(num+ " ");
        }


    }

    public static void main(String[] args) {
        int[] arr = {13,46,24,56,4,99};
        System.out.println("before sorting");
        for (int num: arr){
            System.out.println(num + " ");
        }
        selectionSort(arr);
    }


}
