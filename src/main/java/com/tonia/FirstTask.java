package com.tonia;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] strArr = scanner.nextLine().split(" ");
        int[] arr = new int[strArr.length];
        int i = 0;
        int k = 0;
        while(i<= arr.length){
            do{
                k++;
            }while(arr[i]>arr[i+k]);
           if(arr[i]< arr[i+k]){
               i = i+k;
               k=0;
           }
        } System.out.println(arr[i]);


    }

}