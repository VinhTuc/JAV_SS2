// phát triển một ứng dụng nhiều chức năng cho phép
// người dùng chọn chức năng để sử dụng
// Menu gồm:
// - Kiểm tra tính chẵn lẻ của 1 số
// - Kiểm tra số nguyên tố
// - Kiểm tra một số có chia hết cho 3 không
// - Thoát

import java.sql.SQLOutput;
import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int luaChon;

    do{
        System.out.println("\nMENU:");
        System.out.println("1. Kiểm tra tính chẳn lẻ");
        System.out.println("2. Kiểm tra số nguyên tố");
        System.out.println("3. Kiểm tra chia hết cho 3");
        System.out.println("0. Thoát");
        System.out.println("Lựa chọn của bạn: ");
        luaChon = sc.nextInt();

        switch(luaChon){
            case 1:
                kiemTraChanLe(sc);
                break;
            case 2:
                kiemTraNguyenTo(sc);
                break;
            case 3:
                kiemTraChiaHetCho3(sc);
                break;
            case 0:
                System.out.println("Thoát chương trình.");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
    } while (luaChon != 0);
}

// Kiểm tra tính chẵn lẻ
    private static void kiemTraChanLe(Scanner sc) {
        System.out.print("Vui lòng nhập số cần kiểm tra: ");
        int num = sc.nextInt();
        if(num % 2 ==0){
            System.out.println(num + " là số chẵn.");
        } else {
            System.out.println(num + " là số lẻ.");
        }
    }

// Kiểm tra số nguyên tố
    private static void kiemTraNguyenTo(Scanner sc) {
    System.out.print("Vui lòng nhập số cần kiểm tra: ");
    int num = sc.nextInt();
    if(num < 2){
        System.out.println(num + " không phải là số nguyên tố.");
    } else {
        boolean laSoNguyenTo = true;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                laSoNguyenTo = false;
                break;
            }
        }
        if(laSoNguyenTo){
            System.out.println(num + " là số nguyên tố");
        } else {
            System.out.println(num + " không phải là số nguyên tố");
        }
    }
}

// Kiểm tra chia hết cho 3
    private static void kiemTraChiaHetCho3(Scanner sc) {
        System.out.print("Vui lòng nhập số cần kiểm tra: ");
        int num = sc.nextInt();
        if(num % 3 == 0){
            System.out.println(num + " chia hết cho 3.");
        } else {
            System.out.println(num + " không chia hết cho 3.");
        }
    }
}
