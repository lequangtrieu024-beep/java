package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // =========================
        // 1. Nhập thông tin sinh viên
        // =========================
        System.out.println("===== QUAN LY DIEM SINH VIEN =====");

        System.out.print("Nhap ma sinh vien: ");
        String maSV = sc.nextLine();

        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();

        double diemChuyenCan;
        double diemGiuaKy;
        double diemCuoiKy;

        // =========================
        // 2. Kiểm tra điểm chuyên cần
        // =========================
        while (true) {
            System.out.print("Nhap diem chuyen can (0 - 10): ");
            diemChuyenCan = sc.nextDouble();

            if (diemChuyenCan >= 0 && diemChuyenCan <= 10) {
                break;
            }

            System.out.println("Diem khong hop le! Vui long nhap lai.");
        }

        // =========================
        // 3. Kiểm tra điểm giữa kỳ
        // =========================
        while (true) {
            System.out.print("Nhap diem giua ky (0 - 10): ");
            diemGiuaKy = sc.nextDouble();

            if (diemGiuaKy >= 0 && diemGiuaKy <= 10) {
                break;
            }

            System.out.println("Diem khong hop le! Vui long nhap lai.");
        }

        // =========================
        // 4. Kiểm tra điểm cuối kỳ
        // =========================
        while (true) {
            System.out.print("Nhap diem cuoi ky (0 - 10): ");
            diemCuoiKy = sc.nextDouble();

            if (diemCuoiKy >= 0 && diemCuoiKy <= 10) {
                break;
            }

            System.out.println("Diem khong hop le! Vui long nhap lai.");
        }

        // =========================
        // 5. Tính điểm tổng kết
        // =========================
        double diemTongKet =
                diemChuyenCan * 0.10
                + diemGiuaKy * 0.30
                + diemCuoiKy * 0.60;

        // =========================
        // 6. Xếp loại
        // =========================
        String xepLoai;

        if (diemTongKet >= 8.5) {
            xepLoai = "A";
        } else if (diemTongKet >= 7.0) {
            xepLoai = "B";
        } else if (diemTongKet >= 5.5) {
            xepLoai = "C";
        } else if (diemTongKet >= 4.0) {
            xepLoai = "D";
        } else {
            xepLoai = "F";
        }

        // =========================
        // 7. Hiển thị kết quả
        // =========================
        System.out.println();
        System.out.println("========== KET QUA ==========");

        System.out.println("Ma sinh vien : " + maSV);
        System.out.println("Ho ten       : " + hoTen);
        System.out.println("Chuyen can   : " + diemChuyenCan);
        System.out.println("Giua ky      : " + diemGiuaKy);
        System.out.println("Cuoi ky      : " + diemCuoiKy);
        System.out.printf("Diem tong ket: %.2f%n", diemTongKet);
        System.out.println("Xep loai     : " + xepLoai);

        sc.close();
    }
}