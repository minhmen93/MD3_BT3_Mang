package tinh_tonng_duong_cheo_ma_tran;

public class TongDuongCheoMaTran {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {5, 6, 7},
                {9, 1, 2},
        };
        int tongDuongCheo = tinhTongDuongCheo(matrix);
        System.out.println("Tổng đường chéo là : " +tongDuongCheo);
    }
    public static int tinhTongDuongCheo(int[][]matrix){
       int tong = 0;
        for (int i = 0; i < matrix.length; i++) {
            tong += matrix[i][i];

        }
        return tong;
    }

}
