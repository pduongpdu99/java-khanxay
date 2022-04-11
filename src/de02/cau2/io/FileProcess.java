package de02.cau2.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class FileProcess {
	// file url initialize
	private String fileURL = "src/test.txt";
	
	/**
	 * file process constructor
	 * @param url
	 */
	public FileProcess(String url) {
		this.fileURL = url;
	}
	
	/**
	 * doc file
	 */
	public void docFile() {
		try {
			File file = new File(this.fileURL);
			try (BufferedReader br = new BufferedReader(new FileReader(file))) {
				String line;
				while((line = br.readLine()) != null) {
					System.out.println(line);
				}
			}
		} catch(Exception exception) {
			exception.printStackTrace();
		}
	}
	
	/**
	 * luu file
	 */
	public void luuFile(ArrayList<String> lineList) {
		try {
			File file = new File(this.fileURL);
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
				for(String line: lineList) {
					bw.append(line+"\n");
				}
			}
		} catch(Exception exception) {
			exception.printStackTrace();
		}
	}
}
