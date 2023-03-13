package demobt1;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 3, 5, 6, 7, 8, 9};
        int[] newArr = new int[arr.length - 1];
        System.out.print("Nhập vào vị trí muốn xóa ");
        int x = scanner.nextInt();

        for (int i = 0 , a = 0 ;  i < arr.length; i++) {
            if (x == i) {
                continue;
            }
            newArr[a++] = arr[i];
        }
        System.out.print("In ra mảng đã xóa " + Arrays.toString(newArr));
    }
}
