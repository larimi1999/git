package com.vti.backend;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		File file = new File("E:\\thuchanhio");
		
		//C:\\Users\\Admin\\Desktop
		//Chiều 14/5, Thủ tướng Nguyễn Xuân Phúc ký công điện khẩn gửi UBND tỉnh Đồng Nai, Bộ Công an, Bộ Lao động - Thương binh và Xã hội, yêu cầu khẩn trương khắc phục hậu quả vụ sập công trình ở Khu công nghiệp Giang Điền, tỉnh Đồng Nai.
		String content = "Ho va Ten:...............";
		//Car car = new Car("CRV","Red","Honda");
		//Thủ tướng cũng yêu cầu UBND tỉnh Đồng Nai khẩn trương tổ chức tìm kiếm, cứu chữa, thăm hỏi, động viên, có biện pháp hỗ trợ kịp thời gia đình có người bị tử vong và bị thương; đồng thời tỉnh chỉ đạo tập trung khắc phục hậu quả vụ tai nạn.
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Admin\\Desktop\\test.txt",true);
		fileOutputStream.write(content.getBytes());
		System.out.println("write file success");
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Admin\\Desktop\\test.txt");
		byte[] b = new byte[1024];
		int length = fileInputStream.read(b);
		fileOutputStream.close();
		//while(length>-1)
		//{
			//String content = new String(b,0,length);
			//System.out.println(content);
			//System.out.println(content.length());
			//length = fileInputStream.read(b);
	//	}
		//for (File i: file.listFiles()) {
			//if(i.isFile()){
			//	if(i.isFile())
				//{
				//	System.out.println(i.getName());
				//}
			//}
		
		}
		
	

}
