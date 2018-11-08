package com.tonia;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] strArr = scanner.nextLine().split(" ");
        int[] arr = new int[strArr.length];
        int first = 1;
        int last = arr.length-1;
        int mid =arr[(first + last)/2];

        while(first <= last){
            while(arr[first]<= mid){
                first++;
            }
            while(arr[last]>mid){
                last--;
            }
            if(first<=last){
                int buffer = arr[first];
                arr[first]=arr[last];
                System.out.println(arr[first]);
                break;
            }

        }




    }
}
