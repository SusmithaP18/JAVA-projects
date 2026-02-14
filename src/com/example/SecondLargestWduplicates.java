package com.example;

public class SecondLargestWduplicates {

        public static void main(String[] args) {

            int[] arr = {5, 5,6, 10,10, 4, 3};

            if (arr.length < 2) {
                System.out.println("No second largest");
                return;
            }

            int largest = arr[0];
            int secondLargest = Integer.MIN_VALUE;

            for (int i = 1; i < arr.length; i++) {

                if (arr[i] > largest) {
                    secondLargest = largest;
                    largest = arr[i];

                } else if (arr[i] < largest && arr[i] > secondLargest) {
                    secondLargest = arr[i];
                }
            }

            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("No second largest");
            } else {
                System.out.println("Second largest: " + secondLargest);
            }
        }
    }
//end