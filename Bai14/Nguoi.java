package Bai14;

import java.util.Scanner;

public class Nguoi {
    protected String hoTen;
    protected int tuoi;
    protected String queQuan;
    protected String maGV;

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhap que quan: ");
        queQuan = sc.nextLine();

        System.out.print("Nhap ma giao vien: ");
        maGV = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Que quan: " + queQuan);
        System.out.println("Ma GV: " + maGV);
    }
  
}