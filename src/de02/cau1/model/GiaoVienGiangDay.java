package de02.cau1.model;

import java.io.BufferedReader;
import java.io.IOException;

public class GiaoVienGiangDay extends GiaoVien {
	private String lopGiangDay, tenMonHoc;
	int soTiet;
	
	/**
	 * GiaoVienGiangDay constructor
	 */
	public GiaoVienGiangDay() {
		this.lopGiangDay = "";
		this.tenMonHoc = "";
		this.soTiet = 0;
	}
	
	/**
	 * GiaoVienGiangDay constructor
	 * @param lop
	 * @param tenMonHoc
	 * @param soTiet
	 */
	public GiaoVienGiangDay(String lop, String tenMonHoc, int soTiet) {
		this.lopGiangDay = lop;
		this.tenMonHoc = tenMonHoc;
		this.soTiet = soTiet;
	}
	
	/**
	 * get lop giang day
	 * @return
	 */
	public String getLopGiangDay() {
		return lopGiangDay;
	}
	
	/**
	 * set lop giang day
	 * @param lopGiangDay
	 */
	public void setLopGiangDay(String lopGiangDay) {
		this.lopGiangDay = lopGiangDay;
	}
	
	/**
	 * get ten mon hoc
	 * @return
	 */
	public String getTenMonHoc() {
		return tenMonHoc;
	}
	
	/**
	 * set ten mon hoc
	 * @param tenMonHoc
	 */
	public void setTenMonHoc(String tenMonHoc) {
		this.tenMonHoc = tenMonHoc;
	}
	
	/**
	 * get so tiet
	 * @return
	 */
	public int getSoTiet() {
		return soTiet;
	}
	
	/**
	 * set so tiet
	 * @param soTiet
	 */
	public void setSoTiet(int soTiet) {
		this.soTiet = soTiet;
	}
	
	/**
	 * nhap ma giao vien va ten giao vien
	 * @param br
	 */
	@Override
	public void nhap(BufferedReader br) {
		try {
			super.nhap(br);
			
			// TODO: code here
			System.out.print("Lop giang day: ");
			setLopGiangDay(br.readLine());
			
			System.out.print("Ten mon hoc: ");
			setTenMonHoc(br.readLine());
			
			System.out.print("So tiet");
			setSoTiet(Integer.parseInt(br.readLine()));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * hien thi
	 */
	@Override
	public void hienThi() {
		// validate ma giao vien
		if(getMaGiaoVien().length() == 0) {
			System.out.println("Ma giao vien khong duoc rong");
		}
				
		// validate ten giao vien
		if(getTenGiaoVien().length() == 0) {
			System.out.println("Ten giao vien khong duoc rong");
		}
				
		// validate ma giao vien
		if(lopGiangDay.length() == 0) {
			System.out.println("lop giang day khong duoc rong");
		}
		
		// validate ten giao vien
		if(tenMonHoc.length() == 0) {
			System.out.println("ten mon hoc khong duoc rong");
		}
		
		// validate ten giao vien
		if(!(0 < soTiet && soTiet < 20)) {
			System.out.println("So tiet khong hop le");
		}
		
		// hien thi ma va ten
		System.out.println(
				String.format(
						"%s %s %s %s %d", 
						getMaGiaoVien(),
						getTenGiaoVien(),
						getLopGiangDay(), 
						getTenMonHoc(),
						getSoTiet()));
		
	}
	
	/**
	 * to string
	 */
	@Override
	public String toString() {
		return String.format(
				"%s %s %s %s %d", 
				getMaGiaoVien(),
				getTenGiaoVien(),
				getLopGiangDay(), 
				getTenMonHoc(),
				getSoTiet());
	}
}
