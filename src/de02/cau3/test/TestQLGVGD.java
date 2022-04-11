package de02.cau3.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import de02.cau1.model.GiaoVienGiangDay;
import de02.cau2.io.FileProcess;

public class TestQLGVGD {
	public static void main(String[] args) {
		
		int soLuong = 2; // declare 2 is amount of teacher 
		GiaoVienGiangDay gvgd[] = new GiaoVienGiangDay[soLuong];
		
		// init array list
		ArrayList<String> lists = new ArrayList<String>(soLuong);
		
		System.out.println("Nhap giang vien giang day");
		for(int i =0;i < soLuong; i++) {
			// initialize
			gvgd[i] = new GiaoVienGiangDay();
			
			// input 
			System.out.println(String.format("Nhap giang vien giang day %d", i+1));
			gvgd[i].nhap(new BufferedReader(new InputStreamReader(System.in)));
			
			// add gvgd into array list
			lists.add(gvgd[i].toString());
		}
		
		// init file process
		FileProcess fp = new FileProcess("src/test.txt");
		
		// luu file
		fp.luuFile(lists);
		
		// doc file
		fp.docFile();
	}
}
