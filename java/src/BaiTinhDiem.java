import java.util.Scanner;

public class BaiTinhDiem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double chuyenCan, giuaKy, cuoiKy, tongKet;

        System.out.print("Nhap diem chuyen can: ");
        chuyenCan = sc.nextDouble();

        System.out.print("Nhap diem giua ky: ");
        giuaKy = sc.nextDouble();

        System.out.print("Nhap diem cuoi ky: ");
        cuoiKy = sc.nextDouble();

        tongKet = chuyenCan * 0.1 + giuaKy * 0.3 + cuoiKy * 0.6;

        System.out.printf("Diem tong ket = %.2f", tongKet);

        sc.close();
    }
}