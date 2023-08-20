package com.example.dsa;

public class EvenDigits {
    public static void main(String[] args) {
        int[] a = {12,345,2,6,7896};
        System.out.println(findNumbers(a));
    }

    static int findNumbers(int[] nums){
        int count = 0;

        for (int num : nums){
            if(even(num)){
                count ++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numOfDigits = digits2(num);

        return numOfDigits % 2 == 0;
    }

    static int digits(int num) {
        int count = 0;

        while (num > 0){
            count++;
            num /= 10;
        }
        return count;
    }

    static int digits2(int num) {
        if (num < 0) {
            num *= -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}
