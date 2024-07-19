// sử dụng vòng lặp while .
// phát triển một ứng dụng cho phép người dùng nhập vào 3 cạnh của một tam giác
// kiểm tra xem nếu 3 cạnh đấy thỏa mãn điều kiện trở thành 1 tam giác
// thì cho phép tính diện tích và chu vi nếu không thì bắt người dùng nhập lại

import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double canh1 = 0, canh2 = 0, canh3 = 0;
        boolean hopLe = false; // Biến kiểm tra tính hợp lệ của tam giác

        while (!hopLe) {
            System.out.println("Nhập 3 cạnh của tam giác: ");
            System.out.print("Cạnh 1: ");
            canh1 = sc.nextDouble();
            System.out.print("Cạnh 2: ");
            canh2 = sc.nextDouble();
            System.out.print("Cạnh 3: ");
            canh3 = sc.nextDouble();

            // Kiểm tra điều kiện tam giác
            if (canh1 + canh2 > canh3 && canh1 + canh3 > canh2 && canh2 + canh3 > canh1) {
                hopLe = true;
            } else {
                System.out.println("Ba cạnh không tạo thành tam giác. Vui lòng nhập lại!");
            }
        }

        // Tính Chu vi và Diện tích
        double chuVi = canh1 + canh2 + canh3;
        double nuaChuVi = chuVi / 2;
        double dienTich = Math.sqrt(nuaChuVi * (nuaChuVi - canh1) * (nuaChuVi - canh2) * (nuaChuVi - canh3));

        System.out.println("Chu vi tam giác: " + chuVi);
        System.out.println("Dien tich: " + dienTich);
    }
}








































































































