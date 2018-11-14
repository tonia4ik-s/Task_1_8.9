package com.tonia;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] strArr = scanner.nextLine().split(" ");
        int[] arr = new int[strArr.length];
        for(int i = 0; i < arr.length; i++){
            String str = strArr[i];
            int val = Integer.parseInt(str);
            arr[i] = val;
        }
        int max = 0;
        int min = 0;
        for( int i = 0; i < arr.length; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
            if(arr[i] < arr[min]){
                min = i;
            }

        }
        System.out.println("max =" + arr[max]);
        System.out.println("min =" + arr[min]);
    }

}