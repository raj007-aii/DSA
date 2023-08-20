package com.example.dsa.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {-4, -3, -1, 0, 4, 10, 15, 17, 22, 26, 35, 44, 65, 72, 89};
        int target = 1;
        int bs = binarySearch(arr, target);
        int ceiling = cellingNum(arr, target);
        int floor = floorNum(arr, target);
        System.out.println("Binary Search:"+bs);
        System.out.println("Ceiling value:"+ceiling);
        System.out.println("Floor value:"+floor);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;



        while (start <= end){

            int mid = start + (end - start) / 2;

            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;

    }

    static int cellingNum(int[] arr, int target){

        if (target > arr[arr.length - 1]){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;



        while (start <= end){

            int mid = start + (end - start) / 2;

            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return arr[start];
    }

    static int floorNum(int[] arr, int target){

        if (target < arr[arr.length - 1]){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;



        while (start <= end){

            int mid = start + (end - start) / 2;

            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return arr[end];
    }

}
