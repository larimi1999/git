package com.vti.backend;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

	public static boolean isFileExists(String pathFile) {
		File file = new File(pathFile);
		if (file.exists()) {
			return true;
		}
		return false;

	}

	public static void createNewFile(String path, String fileName) {
		File file = new File(path + fileName);

		try {

			if (file.createNewFile()) {
				System.out.println("Tao file thanh cong");
			} else {
				System.out.println("Error! File Exist.");
			}
		} catch (IOException e) {
			System.out.println("Khong tao duoc file");
		}

	}
	
	public static void deleteFile(String pathFile) throws FileException
	{
		File file = new File(pathFile);
		if(!file.exists())
		{
			throw new FileException("Error! File Not Exist.");
		}
		else
		{
			System.out.println("Xoa thanh cong");
			file.delete();
		}
	}
	
	public static boolean isFolder(String path)
	{
		 File f = new File(path); 
		  
	        // Check if the specified path 
	        // is a directory or not 
	        if (f.isDirectory()) 
	           return true;
	        else
	           return false;
	}
	
	public static List<String> getAllFileName(String path) throws FileException
	{
		List<String> results = new ArrayList<String>();
		
		if(isFolder(path))
		{
			
		}
		else
		{
			throw new FileException("Error!Path is not folder");
		}

		File[] files = new File(path).listFiles();
		//If this pathname does not denote a directory, then listFiles() returns null. 

		for (File file : files) {
		    if (file.isFile()) {
		        results.add(file.getName());
		    }
		}
		return results;
		
	}
	public static void moveFile(String pathOldFile, String	newPath) throws FileException
	{
		   File source = new File(pathOldFile);
	        File dest = new File(newPath);
	        if(!source.exists())
	        {
	        	throw new FileException("Error!File Not Exist");
	        }
	        if (source.renameTo(dest)) {
	            System.out.println("Move file " + source.getAbsolutePath() + " to " + dest.getAbsolutePath() + " success.");
	        }
	}
	
	public void renameFile(String pathOldFile, String newName) throws FileException
	{
		File oldfile =new File(pathOldFile);
		File newfile =new File(newName);
		if(!oldfile.exists())
		{
			throw new FileException("Error!File not Exists!");
		}
		if(oldfile.renameTo(newfile)){
			System.out.println("Rename succesful");
		}else{
			System.out.println("Rename failed");
		}
	}
	
	public void createNewFolder(String newPathFolder) throws FileException
	{
		File file = new File(newPathFolder);
	      //Creating the directory
		  if(file.exists())
		  {
			  throw new FileException("Error!Folder Exists");
		  }
	      boolean bool = file.mkdir();
	      if(bool){
	         System.out.println("Directory created successfully");
	      }else{
	         System.out.println("Sorry couldn’t create specified directory");
	      }
	}
	
	public void downloadFile(String fileLink, String folderSave) throws IOException
	{
		//if folder not Exist or not folder
		File folder = new File(folderSave);
		if(!folder.exists()||!folder.isDirectory())
		{
			//show message error
			System.out.println("FOLDER_NOT_EXISTS_OR_NOT_FOLDER");
		}
		//if folder exist
		//get name file
		String s[]  = fileLink.split("/");
		String name = s[s.length-1];
		
		//create connection to URL
		URL url = new URL(fileLink);
		//open connection
		URLConnection connection = url.openConnection();
		//get size of file
		int size = connection.getContentLength();
		//read file from Internet use InputStream;
		InputStream in = connection.getInputStream();
		FileOutputStream output =  new FileOutputStream(folderSave);
		int byteDownloaded = 0;
		byte[] b = new byte[1024];
		//get length of file . If not read then length = -1;
		int length = in.read(b);
		while(length !=-1)
		{
			byteDownloaded +=length;
			//print % byte downloaded
			System.out.println(byteDownloaded*100f/ size +"%");
			//write content downloaded from position 0->length to output
			output.write(b,0,length);
			length = in.read(b);
			
		}
		//close
		output.close();
		in.close();
		System.out.println("DOWNLOAD_FILE_SUCCESS");
		
		
		
	}
	
}