package gia_tri_lon_nhat_trong_mang_2_chieu;


public class Gia_tri_lon_nhat_trong_mang_2_chieu {
    public static void main(String[] args) {
    int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
    int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j]>max){
                    max = arr[j][j];
                }
            }
        }
        System.out.print("Giá trị lớn nhất trong mảng 2 chieu là " +max);
    }
}