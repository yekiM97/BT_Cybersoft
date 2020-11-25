package com.cybersoft.java.oop;

import java.util.LinkedList;
import java.util.List;

public class QLSinhVien {
	private LinkedList<SinhVien> dsSinhVien;

	/* getters/setters */
	public LinkedList<SinhVien> getDsSinhVien() {
		return this.dsSinhVien;
	}

	/* constructors */
	public QLSinhVien() {
		dsSinhVien = new LinkedList<SinhVien>();
	}

	public boolean themSinhVien(SinhVien sinhVien) {
		if (sinhVien == null)
			return false;

		if ("".equals(sinhVien.getTen()) || "".equals(sinhVien.getMaSV()))
			return false;

		if (kiemTraTrungMaSo(sinhVien.getMaSV()))
			return false;

		return dsSinhVien.add(sinhVien);
	}

	private boolean kiemTraTrungMaSo(String maSV) {
		// TODO Auto-generated method stub
		for (SinhVien sinhVien : this.dsSinhVien) {
			if (sinhVien.getTen().equalsIgnoreCase(maSV)) {
				return true;
			}
		}
		return false;
	}

	public void xuatThongTinSV() {
		for (SinhVien sinhVien : dsSinhVien) {
			sinhVien.xuatThongTin();
		}
	}

	public void tinhDTB() {
		for (SinhVien sinhVien : dsSinhVien) {
			sinhVien.xuatThongTin();
			System.out.println("\tĐiểm trung bình: " + String.format("%.1f", sinhVien.tinhDiemTrungBinh()));
		}
	}

	public void xepLoaiSV() {
		for (SinhVien sinhVien : dsSinhVien) {
			sinhVien.xuatThongTin();
			System.out.println("\tXếp loại: " + sinhVien.xepLoai());
		}
	}

	public void inSVCoDTBMax() {
		List<SinhVien> dsSV = new LinkedList<SinhVien>();
		SinhVien max = this.dsSinhVien.get(0);

		for (SinhVien sinhVien : dsSinhVien) {
			if (sinhVien.tinhDiemTrungBinh() >= max.tinhDiemTrungBinh())
				dsSV.add(sinhVien);
		}

		for (SinhVien sinhVien : dsSV) {
			if (sinhVien.tinhDiemTrungBinh() == max.tinhDiemTrungBinh())
				sinhVien.xuatThongTin();
		}
		System.out.println();
	}

	public void inSVYeu() {
		List<SinhVien> dsSVYeu = new LinkedList<SinhVien>();

		for (SinhVien sinhVien : dsSinhVien) {
			if (sinhVien.tinhDiemTrungBinh() < 5)
				dsSVYeu.add(sinhVien);
		}

		for (SinhVien sinhVien : dsSVYeu) {
			sinhVien.xuatThongTin();
			System.out.println("\tĐiểm trung bình: " + String.format("%.1f", sinhVien.tinhDiemTrungBinh()));
			System.out.println("\tXếp loại: " + sinhVien.xepLoai());
		}
		System.out.println();
	}

	public boolean timSVTheoTen(String ten) {
		for (SinhVien sinhVien : dsSinhVien) {
			if (sinhVien.getTen().equalsIgnoreCase(ten)) {
				sinhVien.xuatThongTin();
				return true;
			}
		}
		System.out.println();
		return false;

	}

	public boolean timSVTheoMaSV(String maSV) {
		for (SinhVien sinhVien : dsSinhVien) {
			if (sinhVien.getMaSV().equalsIgnoreCase(maSV)) {
				sinhVien.xuatThongTin();
				return true;
			}
		}
		System.out.println();
		return false;

	}

	public boolean xoaSVTheoMaSV(String maSV) {
		for (SinhVien sinhVien : dsSinhVien) {
			if (sinhVien.getMaSV().equalsIgnoreCase(maSV)) {
				dsSinhVien.remove(sinhVien);
				return true;
			}
		}
		return false;
	}
}
