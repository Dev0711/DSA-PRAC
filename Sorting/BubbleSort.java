package Sorting;

public class BubbleSort {
    public static void BubbleSort(int[] arr) {
        int n = arr.length;
        //outer loop for passes
        for(int i= 0; i <= n -1; i++ ){

            //Inner loop for comparing the values
            for(int j = 0; j < n - i - 1;j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;

                }

            }
        }
        System.out.println("after using buuble sort");
        for(int num: arr){
            System.out.println(num + " ");
        }

    }

    public static void main (String[] args){
        int[] arr = {13,46,24,52,20,9};
        System.out.println("before using bubble sort");
        for (int num: arr){
            System.out.println(num + " ");
        }
        BubbleSort(arr);
    }
}
