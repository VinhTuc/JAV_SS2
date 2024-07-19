// Xây dựng một ứng dụng cho phép người dùng nhập vào 1 số tự nhiên 
// và kiểm tra xem số đó có chia hết cho 3 và 5 hay không.

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao mot so tu nhien: ");
        int soTuNhien = scanner.nextInt();

        // Kiểm tra chia hết cho 3 và 5

        if (soTuNhien % 3 == 0 && soTuNhien % 5 == 0) {
            System.out.println(soTuNhien + " chia het cho ca 3 va 5.");
        } else if (soTuNhien % 3 == 0) {
            System.out.println(soTuNhien + " chia het cho 3 nhung khong chia het cho 5.");
        } else if (soTuNhien % 5 == 0) {
            System.out.println(soTuNhien + " chia het cho 5 nhung khong chia het cho 3.");
        } else {
            System.out.println(soTuNhien + " khong chia het cho 3 va 5.");
        }
        scanner.close();
    }
}