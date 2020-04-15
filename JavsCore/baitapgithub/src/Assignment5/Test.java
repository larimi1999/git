package Assignment5;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Moi ban nhap vao do dai cua mang : ");
		int n = scanner.nextInt();
		//InsertSort
		InsertSort k = new InsertSort(n);
		//Nhap Mang
		k.input();
		//Xuat Mang
		System.out.println("Mang truoc khi nhap la : ");
		k.print();
	    //Chay InsertSort
		k.insertionSort(k.getArray(),n);
		//Mang sau khi chay InsertSort
		System.out.println("Mang sau khi chay InsertSort la :");
		k.print();
		System.out.println("------------------------------------------------------");
		
		//QuickSort
		QuickSort qs = new QuickSort(n);
		//Enter elements of the array
		qs.input();
		//Print the array before sorting
		System.out.println("Array :");
		qs.print();
		//Sorting the array
		qs.quickSort(qs.getArray(), 0, n-1);
		//Print the array after sorting
		System.out.println("Array after Quick Sorting : ");
		qs.print();
		
		System.out.println("-------------------------------------------------------");
		//SelectionSort
		SelectionSort ss = new SelectionSort(n);
		//Enter elements of the aray 
		ss.input();
		//Print the array before sorting 
		System.out.println("Array :");
		ss.print();
		//Chay mang
		ss.sap_xep_chon(ss.getArray(),n);
		//Print the array after sorting 
		System.out.println("Array after Selection Sorting :");
		ss.print();
		
		
	}

}
