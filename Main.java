package com.example.dsa;

public class Main {
    public static void main(String[] args) {
        int[] arr = {14, 52, 7, 89, 63, 21, 15, 63, 55};
        int target = 15;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for (int i=0; i<arr.length; i++){
            int element = arr[i];
            if (element == target){
                return i;
            }
        }

        return -1;
    }
}
