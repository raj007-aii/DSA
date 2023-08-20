package com.example.dsa.binarysearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-4, -3, -1, 0, 4, 10, 15, 17, 22, 26, 35, 44, 65, 72, 89};
        int target = 11;
        int ans = orderAgnosticBinarySearch(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){

            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if (target > arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }

        return -1;
    }
}
