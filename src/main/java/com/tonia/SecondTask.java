package com.tonia;
import java.util.Arrays;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] strArr = scanner.nextLine().split(" ");
        int[] arr = new int[strArr.length];
        for(int i = 0; i < arr.length; i++){
            String str = strArr[i];
            int val = Integer.parseInt(str);
            arr[i] = val;
        }
       // System.out.println(Arrays.toString(arr));
        boolean isSorted = false;
        int buf;
        while(!isSorted){
            isSorted = true;
            for(int i = 0; i < arr.length - 1; i++){
                if(arr[i] > arr[i+1]){
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }

            }

        }System.out.println(Arrays.toString(arr));

    }

}

