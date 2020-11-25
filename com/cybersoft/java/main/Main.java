package com.cybersoft.java.main;

import java.util.Scanner;

import com.cybersoft.java.oop.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int luaChon;
		QLSinhVien dsSV = new QLSinhVien();

		taoDummyData(dsSV);

		boolean thoat = false;

		do {
			luaChon = inMenu(sc);
			thoat = xuLyLuaChon(luaChon, sc, dsSV);
		} while (!thoat);

	}

	private static boolean xuLyLuaChon(int luaChon, Scanner sc, QLSinhVien dsSV) {
		// TODO Auto-generated method stub
		String ten, maSV;
		boolean kq = false;
		switch (luaChon) {
		case 1:
			dsSV.tinhDTB();
			break;
		case 2:
			dsSV.xepLoaiSV();
			break;
		case 3:
			dsSV.inSVCoDTBMax();
			break;
		case 4:
			dsSV.inSVYeu();
			break;
		case 5:
			System.out.print("Nhập vào tên sinh viên cần tìm: ");
			ten = sc.nextLine();
			kq = dsSV.timSVTheoTen(ten);
			if (!kq)
				System.out.println("Không tìm thấy sinh viên có tên: " + ten);
			break;
		case 6:
			System.out.print("Nhập vào mã sinh viên cần tìm: ");
			maSV = sc.nextLine();
			kq = dsSV.timSVTheoMaSV(maSV);
			if (!kq)
				System.out.println("Không tìm thấy sinh viên có mã: " + maSV);
			break;
		case 7:
			System.out.print("Nhập vào mã sinh viên muốn xóa: ");
			maSV = sc.nextLine();
			kq = dsSV.xoaSVTheoMaSV(maSV);

			if (kq)
				System.out.println("Xóa thành công sinh viên có mã: " + maSV);
			else
				System.out.println("Xóa không thành công sinh viên có mã: " + maSV);

			System.out.println();
			break;
		case 8:
			dsSV.xuatThongTinSV();
			break;
		case 0:
			System.out.println("Đã thoát chương trình.");
			return true;
		default:
			System.out.println("Vui lòng chọn đúng menu.");
			break;
		}
		sc.nextLine();
		return false;

	}

	private static int inMenu(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("1. Tính điểm trung bình cho từng sinh viên.");
		System.out.println("2. Xếp loại cho từng sinh viên.");
		System.out.println("3. In ra sinh viên có điểm trung bình cao nhất.");
		System.out.println("4. In ra tất cả sinh viên yếu.");
		System.out.println("5. Tìm sinh viên theo tên.");
		System.out.println("6. Tìm sinh viên theo mã.");
		System.out.println("7. Xóa sinh viên theo tên.");
		System.out.println("8. In danh sách tất cả sinh viên.");
		System.out.println("0. Thoát chương trình.");
		System.out.print("Mời bạn chọn: ");

		return Integer.parseInt(sc.nextLine());
	}

	public static void taoDummyData(QLSinhVien dsSV) {
		dsSV.themSinhVien(new SinhVien("Toan", "SV01", 5.6f, 2.2f, 2.3f));
		dsSV.themSinhVien(new SinhVien("Tuan", "SV02", 4.2f, 6.8f, 7.0f));
		dsSV.themSinhVien(new SinhVien("Huu", "SV03", 10.0f, 3.5f, 7.3f));
		dsSV.themSinhVien(new SinhVien("Hien", "SV04", 6.8f, 9.2f, 4.9f));
		dsSV.themSinhVien(new SinhVien("Lan", "SV05", 8.4f, 6.2f, 7.1f));
	}

}
