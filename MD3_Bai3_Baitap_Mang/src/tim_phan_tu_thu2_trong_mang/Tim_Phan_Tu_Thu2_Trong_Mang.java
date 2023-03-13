package tim_phan_tu_thu2_trong_mang;

public class Tim_Phan_Tu_Thu2_Trong_Mang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = 0;
        int max1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max1 = max;
                max = arr[i];
            }
        }
        System.out.println("Phần tử lớn thứ 2 của mảng là "+ max1);
    }
    }
