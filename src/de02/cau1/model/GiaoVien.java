package de02.cau1.model;

import java.io.BufferedReader;
import java.io.IOException;

public class GiaoVien {
	
	private String maGiaoVien, tenGiaoVien;
	
	/**
	 * giao vien constructor
	 */
	public GiaoVien() {
		this.maGiaoVien = "";
		this.tenGiaoVien = "";
	}
	
	/**
	 * giao vien constructor
	 * @param ma
	 * @param ten
	 */
	public GiaoVien(String ma, String ten) {
		this.maGiaoVien = ma;
		this.tenGiaoVien = ten;
	}
	
	/**
	 * get ma giao vien
	 * @return
	 */
	public String getMaGiaoVien() {
		return maGiaoVien;
	}
	
	/**
	 * set ma giao vien
	 * @param maGiaoVien
	 */
	public void setMaGiaoVien(String maGiaoVien) {
		this.maGiaoVien = maGiaoVien;
	}
	
	/**
	 * get ten giao vien
	 * @return
	 */
	public String getTenGiaoVien() {
		return tenGiaoVien;
	}
	
	/**
	 * set tedn giao vien
	 * @param tenGiaoVien
	 */
	public void setTenGiaoVien(String tenGiaoVien) {
		this.tenGiaoVien = tenGiaoVien;
	}
	
	/**
	 * nhap ma giao vien va ten giao vien
	 * @param br
	 */
	public void nhap(BufferedReader br) {
		try {
			// TODO: code here
			System.out.print("Ma giao vien: ");
			this.maGiaoVien = br.readLine();
			
			System.out.print("Ten giao vien: ");
			this.tenGiaoVien = br.readLine();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void hienThi() {
		// validate ma giao vien
		if(maGiaoVien.length() == 0) {
			System.out.println("Ma giao vien khong duoc rong");
		}
		
		// validate ten giao vien
		if(tenGiaoVien.length() == 0) {
			System.out.println("Ten giao vien khong duoc rong");
		}
		
		// hien thi ma va ten
		System.out.println(
				String.format(
						"%s %s", 
						getMaGiaoVien(), 
						getTenGiaoVien()));
	}
}
