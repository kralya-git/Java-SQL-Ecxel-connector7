package com.test.idea;

import java.util.Scanner;

public class bubble{
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите числа: ");
        String users_input = scan.nextLine();
        String strArr[] = users_input.split(" ");
        int arr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        //int arr[] ={3,60,35,2,45,320,5};

        System.out.println("Было: ");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        bubbleSort(arr);//sorting array elements using bubble sort

        System.out.println("Стало: ");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}