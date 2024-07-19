//Phát triển một ứng dụng cho phép hiển thị các số nguyên tố nhỏ hơn 100
//Số nguyên tố là một số nguyên dương chỉ chia hết cho 1 và chính nó


public class BT5 {
    // Kiem tra mot so co phai la so nguyen to hay khong?
    public static boolean soNguyenTo (int n) {
        if(n <= 1 ) {
            return false; // So 1 va cac so nho hon khong phai la so nguyen to
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false; // So chia het cho mot so khac 1 va chinh no
            }
        }
        return true; // So chi chia het cho 1 va chinh no
    }

    public static void main(String[] args) {
        System.out.println("Cac so nguyen to nho hon 100 la: ");
        for(int i = 2; i < 100; i++) {
            if(soNguyenTo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
