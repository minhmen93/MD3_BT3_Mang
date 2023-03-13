package gia_tri_nho_nhat_trong_mang;

import java.util.Scanner;

public class Gia_tri_nho_nhat_trong_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = {9,3,4,5,6,7,8,9};
        int min = arr[1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = min;
        }
        System.out.print("Giá trị nhỏ nhất của mảng là :"+ min);
    }
}
