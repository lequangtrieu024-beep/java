
package Bai14;

public class CBGV extends Nguoi {

    private double luongCung;
    private double luongThuong;
    private double tienPhat;

    public void nhapThongTin() {
        nhap();

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Nhap luong cung: ");
        luongCung = sc.nextDouble();

        System.out.print("Nhap luong thuong: ");
        luongThuong = sc.nextDouble();

        System.out.print("Nhap tien phat: ");
        tienPhat = sc.nextDouble();
    }

    

    public double tinhLuong() {
        return luongCung + luongThuong - tienPhat;
    }

    public void xuatThongTin() {
        xuat();
        System.out.println("Luong cung: " + luongCung);
        System.out.println("Luong thuong: " + luongThuong);
        System.out.println("Tien phat: " + tienPhat);
        System.out.println("Luong thuc linh: " + tinhLuong());
    }

    public String getMaGV() {
        return maGV;
    }
}