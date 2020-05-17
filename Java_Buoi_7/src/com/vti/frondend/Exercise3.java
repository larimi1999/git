package com.vti.frondend;

import java.io.IOException;

import com.vti.backend.FileException;
import com.vti.backend.FileManager;

public class Exercise3 {
	public static void main(String[] args) {
		//Question1();
		//Question2();
		//try {
			//Question3();
		//} catch (FileException e) {
			//System.out.println("File khong ton tai");
		//}
		//Question5();
		//Question6();
		//Question9();
		//Question10();
		Question11();
		
	}
	static void Question1()
	{
		FileManager flm = new FileManager();
		System.out.println(flm.isFileExists("C:\\Users\\Admin\\Desktop\\test.txt"));
	}
	static void Question2()
	{
		FileManager flm = new FileManager();
		flm.createNewFile("C:\\Users\\Admin\\Desktop", "\\test5.txt");
	}
	static void Question3() throws FileException
	{
		FileManager flm = new FileManager();		
		flm.deleteFile("C:\\Users\\Admin\\Desktop\\test.txt");
	
	}
	static void Question5()
	{
		FileManager flm = new FileManager();
		System.out.println(flm.isFolder("C:\\Users\\Admin"));
	}
	static void Question6()
	{
		FileManager flm = new FileManager();
		try {
			System.out.println(flm.getAllFileName("C:\\Users\\Admin\\Desktop"));
		} catch (FileException e) {
			e.printStackTrace();
		}
	}
	//Question 7 : Chiu .
	static void Question8()
	{
		FileManager flm = new FileManager();
		try {
			flm.moveFile("C:\\Users\\Admin\\Desktop\\test1.txt","E:\\thuchanhio\\duocdima.txt");
		} catch (FileException e) {
			System.out.println("File not Exists");
		}
	}
	
	static void Question9()
	{
		FileManager flm = new FileManager();
		
		try {
			flm.renameFile("C:\\Users\\Admin\\Desktop\\nhat2.txt", "C:\\Users\\Admin\\Desktop\\nhat3.txt");
		} catch (FileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	static void Question10()
	{
		FileManager flm = new FileManager();
		try {
			flm.createNewFolder("C:\\Users\\Admin\\Desktop\\deptrai1");
		} catch (FileException e) {
			e.printStackTrace();
		}
	}
	
	static void Question11()
	{
		FileManager flm = new FileManager();
		try {
			flm.downloadFile("https://thanhcuong.wordpress.com/2011/02/22/doc-va-ghi-file-text-trong-c/", "C:\\Users\\Admin\\Desktop\\nhat3.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
}

