package xoa_phan_tu_khoi_mang;

import java.util.Scanner;

public class Xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = {1,3,4,5,7,4};
        System.out.println("nhập số bạn muốn tìm : ");
        int addNum = scanner.nextInt();
        for (int i = 0; i < num.length; i++) {
            if (addNum == num[i]){
                continue;
            }
            System.out.print(num[i]);
        }
    }
}

