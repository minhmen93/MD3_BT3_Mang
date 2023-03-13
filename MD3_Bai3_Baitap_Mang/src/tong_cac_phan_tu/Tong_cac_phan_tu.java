package tong_cac_phan_tu;

import java.util.Scanner;

public class Tong_cac_phan_tu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số phần tử trong mảng : ");
            int n = scanner.nextInt();
        double[] arr = new double[n];
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập vào giá trị của phần tử thứ " + (i + 1) + " : ");
            arr[i] = scanner.nextDouble();
        }
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        System.out.format("In ra tong cua cac phần tử %.2f ", total);
    }

}

