package com.org.dsa.practice;

public class LinearSearchAndBinarySearch {
    public static void main(String[] args) {
        int nums[] = {5,7,9,11,13};
        int target = 11;

        int result1 = linearSearch(nums, target);
        if(result1 != -1){
            System.out.println("Element found at Index : " +result1);
        }else{
            System.out.println("Element not found");
        }

        int result2 = binarySearch(nums, target);
        if(result2 != -1){
            System.out.println("Element found at Index : " +result1);
        }else{
            System.out.println("Element not found");
        }

    }

    private static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

       while(left <= right) {
           int mid = (left + right) / 2;
           if (nums[mid] == target) {
               return mid;
           } else if (nums[mid] < target) {
               left = mid+1;
           } else {
                right = mid-1;
           }
       }
       return -1;
    }

    private static int linearSearch(int[] nums, int target) {
        for(int i = 0; i< nums.length; i++){
            if(nums[i]== target){
                return i;
            }
        }
        return -1;
    }
}
