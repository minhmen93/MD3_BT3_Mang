package gop_mang;

import java.util.Arrays;
import java.util.Scanner;

public class Gop_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4,5,6};
       int[] resultArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            resultArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length ; i++) {
            resultArr[arr1.length+i] = arr2[i];
        }
    System.out.print(" In ra Result Arr "+ Arrays.toString(resultArr));
    }
}
