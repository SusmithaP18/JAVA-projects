package com.example;

public class ArraySecondLargest {
    public static void main(String[] args){
        int[] arr = {1,3,5,4,2};

        int l = arr[0];
        int SL = Integer.MIN_VALUE;

        for (int i =0; i<arr.length; i++){

            if(arr[i] > l) {

                SL = l;
                l = arr[i];
            } else if (arr[i]< l && arr[i] > SL) {
                SL = arr[i];
            }
        }
    System.out.println("Second Largest :" + SL);
    }
}
