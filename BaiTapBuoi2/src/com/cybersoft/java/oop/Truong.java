package com.cybersoft.java.oop;

import java.util.LinkedList;
import java.util.List;

public class Truong {
	private List<QLSinhVien> dsQLSV;

	public List<QLSinhVien> getDsQLSV() {
		return dsQLSV;
	}

	public Truong() {
		dsQLSV = new LinkedList<QLSinhVien>();
	}

}
