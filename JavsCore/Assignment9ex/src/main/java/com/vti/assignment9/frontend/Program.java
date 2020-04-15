package com.vti.assignment9.frontend;

import java.util.Scanner;

import com.vti.assignment9.utils.ScannerUtils;
/**
 * This method is . 
 * 
 * @Description: .
 * @author: Ngo Trung Nhat
 * @create_date: Mar 24, 2020
 * @version: 1.0
 * @modifer: Ngo Trung Nhat
 * @modifer_date: Mar 24, 2020
 * @param userName
 */

public class Program {
	public static void main(String[] args) {
		Function function = new Function();
		
		System.out.println("Please make your choose : !");
		Scanner scanner = new Scanner(System.in);
		int choose ;
		while(true)
		{
			System.out.println("1.Insert Fresher.");
			System.out.println("2.Update Fresher.");
			System.out.println("3.Exit.");
			
			choose = ScannerUtils.readInt(scanner, "");
			if(choose == 1)
			{
				function.createFresher();
				
			}
			if(choose == 2 )
			{
				function.modifyFresher();
				
			}
			if(choose == 3)
			{
				System.exit(0);
			}
		}
	}	
}
