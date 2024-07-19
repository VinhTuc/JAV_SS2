//phát triển một ứng dụng cho phép hiển thị 20 số nguyên tố đầu tiên

public class BT6 {

    public static boolean soNguyenTo(int  num) {
        if (num <= 1){
            return false;
        }
        for (int i = 2;i * i <=num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("20 so nguyen to dau tien la: ");

        int count = 0; // Bien dem so luong s nguyen to da tim thay
        int num = 2; // Bat dau tu so 2

        while (count < 20) {
            if (soNguyenTo(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
     }
}
