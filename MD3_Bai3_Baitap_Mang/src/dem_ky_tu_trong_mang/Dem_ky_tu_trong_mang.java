package dem_ky_tu_trong_mang;

import java.util.Arrays;
import java.util.Scanner;

public class Dem_ky_tu_trong_mang {
    public static void main(String[] args) {
             String str= "Hello world";
        char check = 'l';
        int count=0;
            for (int i = 0; i < str.length() ; i++) {
                if (str.charAt(i)==check){
                    count++;
                }
        }
        System.out.println("Chuỗi của bạn là: "+str);
        System.out.println("Số lần xuất hiện của ký tự "+check+" trong chuỗi "+str+" la "+count);
    }
}