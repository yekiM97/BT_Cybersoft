package com.cybersoft.java.oop;

import java.util.Scanner;

public class SinhVien {
	private String ten;
	private String maSV;
	private float diemToan;
	private float diemHoa;
	private float diemLy;

	public String getTen() {
		return ten;
	}

	public String getMaSV() {
		return maSV;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public SinhVien() {

	}

	public SinhVien(String ten, String maSV, float diemToan, float diemLy, float diemHoa) {
		this.ten = ten;
		this.maSV = maSV;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.println("======****NHẬP THÔNG TIN SINH VIÊN****======");
		System.out.print("\tMã số: ");
		this.maSV = sc.nextLine();
		System.out.print("\tHọ tên: ");
		this.ten = sc.nextLine();
		System.out.print("\tĐiểm Toán: ");
		this.diemToan = Float.parseFloat(sc.nextLine());
		System.out.print("\tĐiểm Lý: ");
		this.diemLy = Float.parseFloat(sc.nextLine());
		System.out.print("\tĐiểm Hóa: ");
		this.diemHoa = Float.parseFloat(sc.nextLine());
	}

	public void xuatThongTin() {
		System.out.println("======****XUẤT THÔNG TIN SINH VIÊN****======");
		System.out.println("\tMã số: " + this.maSV);
		System.out.println("\tHọ tên: " + this.ten);
		System.out.println("\tĐiểm Toán: " + this.diemToan);
		System.out.println("\tĐiểm Lý: " + this.diemLy);
		System.out.println("\tĐiểm Hóa: " + this.diemHoa);
//		System.out.println("\tĐiểm Trung Bình: " + tinhDiemTrungBinh());
//		System.out.println("\tXếp loại: " + xepLoai());
	}

	public float tinhDiemTrungBinh() {
		return (diemToan + diemLy + diemHoa) / 3;
	}

	public String xepLoai() {
		float diemTb = tinhDiemTrungBinh();

		if (diemTb > 10 || diemTb < 0) {
			return "Không thể xếp loại";
		}

		if (diemTb >= 9)
			return "Xuất sắc";

		if (diemTb >= 8)
			return "Giỏi";

		if (diemTb >= 7)
			return "Khá";

		if (diemTb >= 6)
			return "TB-Khá";

		if (diemTb >= 5)
			return "TB";

		return "Yếu";
	}

}
