package Bai14;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<CBGV> ds = new ArrayList<>();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them giao vien");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Xoa theo ma GV");
            System.out.println("4. Thoat");

            System.out.print("Chon: ");
            int chon = sc.nextInt();

            switch (chon) {

                case 1:
                    CBGV gv = new CBGV();
                    gv.nhapThongTin();
                    ds.add(gv);
                    break;

                case 2:
                    for (CBGV x : ds) {
                        x.xuatThongTin();
                        System.out.println("----------------");
                    }
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Nhap ma GV can xoa: ");
                    String ma = sc.nextLine();

                    for (int i = 0; i < ds.size(); i++) {
                        if (ds.get(i).getMaGV().equals(ma)) {
                            ds.remove(i);
                            System.out.println("Da xoa!");
                            break;
                        }
                    }
                    break;

                case 4:
                    sc.close();
                    return;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}