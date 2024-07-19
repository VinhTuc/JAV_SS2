// phát triển một ứng dụng cho phép người dùng 
// nhập vào 1 khoảng số tự nhiên và 
// yêu cầu tính tổng các số chẵn nằm trong khoảng đó

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);

        System.out.print("Nhap vao so bat dau: ");
        int soBatDau = scannner.nextInt();

        System.out.print("Nhap vao so ket thuc: ");
        int soKetThuc = scannner.nextInt();

        int tong = 0;

        // Kiểm tra nếu số bắt đầu lớn hơn số kết thúc
        if (soBatDau > soKetThuc) {
            System.out.println("So bat dau phai nho hon hoac bang so ket thuc.");
            return; // Thoát khỏi chương trình nếu không hợp lệ
        }

        for (int i = soBatDau; i <= soKetThuc; i++) {
            if (i % 2 == 0) { // Kiểm tra số chẵn
                tong += i;
            }
        }

        System.out.println("Tong cac so chan tu " + soBatDau + " den " + soKetThuc + " la: " + tong);
        scannner.close();
    }
}
