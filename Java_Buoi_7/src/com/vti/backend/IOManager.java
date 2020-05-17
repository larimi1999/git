package com.vti.backend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IOManager {
	public static String readFile(String pathFile) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(pathFile);

		byte[] b = new byte[1024];
		int length = fileInputStream.read(b);
		String content = null;
		while (length > -1) {
			String content1 = new String(b, 0, length);
			length = fileInputStream.read(b);
			content = content1;
		}

		return content;

	}

	public static void writeFile(String pathFile, String content) throws IOException {
		String ct = content;
		FileOutputStream fileOutputStream = new FileOutputStream(pathFile, true);
		fileOutputStream.write(content.getBytes());
		fileOutputStream.close();
	}

	public void WriteObjectToFile(Object serObj, String filepath) {

		try {

			FileOutputStream fileOut = new FileOutputStream(filepath);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(serObj);
			objectOut.close();
			System.out.println("The Object  was succesfully written to a file");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public Object ReadObjectFromFile(String filepath) {

		try {

			FileInputStream fileIn = new FileInputStream(filepath);
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);

			Object obj = objectIn.readObject();

			System.out.println("The Object has been read from the file");
			objectIn.close();
			return obj;

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

}
