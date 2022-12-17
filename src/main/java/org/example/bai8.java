package org.example;
import java.util.Scanner;
import java.util.StringTokenizer;
public class bai8 {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập chuỗi: ");
        str = scanner.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(str);// Hàm tạo này nhận tất cả các dấu phân cách mặc định đã được định nghĩa trong định nghĩa của lớp StringTokenizer.
        int soTuTrongChuoi = stringTokenizer.countTokens();//countToken trả về số lượng được phân tách bằng khoảng trắng
        System.out.println("Số từ có trong chuỗi \"" + str + "\" = " + soTuTrongChuoi);
    }
}