// Xây dựng một ứng dụng cho phép người dùng nhập vào 1 số từ 0 => 9 
// và hiển thị cách đọc của số đó trên màn hình
// VD: người dùng nhập vào 1 thì hiển thị “Số Một”

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao mot so tu 0 den 9: ");
        int so = scanner.nextInt();

        String cachDoc;

        switch (so) {
            case 0:
                cachDoc = "So Khong";
                break;
            case 1:
                cachDoc = "So Mot";
                break;
            case 2:
                cachDoc = "So Hai";
                break;
            case 3:
                cachDoc = "So Ba";
                break;
            case 4:
                cachDoc = "So Bon";
                break;
            case 5:
                cachDoc = "So Nam";
                break;
            case 6:
                cachDoc = "So Sau";
                break;
            case 7:
                cachDoc = "So Bay";
                break;
            case 8:
                cachDoc = "So Tam";
                break;
            case 9:
                cachDoc = "So Chin";
                break;
            default:
                cachDoc = "So khong hop le";
        }

        System.out.println(cachDoc);
        scanner.close();
    }
}
