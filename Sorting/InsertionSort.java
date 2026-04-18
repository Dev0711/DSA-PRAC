package Sorting;

public class InsertionSort {
    public static void insertionsort(int[] inputArray){
        int n = inputArray.length;

        for(int i = 1; i< n; i++){
            int currentValue = inputArray[i];
            int j = i -1;

            while(j>=0 && inputArray[j]> currentValue){
                inputArray[j+1] = inputArray[j];
                j--;
            }
            inputArray[j+1] = currentValue;
        }

        System.out.println("after sorting");
        for(int nums: inputArray){
            System.out.println(nums+ "");
        }

    }

    public static void main(String[] args) {
        int[] nums = {3,1,6,4,7,9,5};

        System.out.println("before sorting");
        for(int num: nums){
            System.out.println(num+ "");
        }
        insertionsort(nums);



    }
}
