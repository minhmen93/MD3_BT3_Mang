package them_phan_tu_vao_mang;

import java.util.Arrays;
import java.util.Scanner;

public class Them_phan_tu_vao_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,4,3,5,6,8,9};
        int[] newArr = new int[arr.length + 1];
        System.out.print("Nhập vào số cần thêm : ");
        int x = scanner.nextInt();
        int i = 0;
        for ( i = 0; i <= arr.length -1  ; i++) {
                newArr[i] = arr[i];

            }
        newArr[arr.length] = x;
            System.out.print("In ra mảng đã thêm " + Arrays.toString(newArr));
        }
    }

