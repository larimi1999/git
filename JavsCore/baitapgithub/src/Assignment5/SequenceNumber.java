package Assignment5;

import java.util.Scanner;

public class SequenceNumber {
	// Xet so phan tu cua mang a .
	private int a[];

	public int[] getArray() {
		return a;
	}

	Scanner scanner = new Scanner(System.in);

	// Nhap cac phan tu cua mang a
	public void input() {

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + (i + 1) + "]=");
			a[i] = scanner.nextInt();
		}
	}

	// Xuat ra cac phan tu cua mang a
	public void print() {

		for (int i = 0; i < a.length; i++) {
			System.out.println(" " + a[i] + " ");
		}
	}

	// Khoi tao SequenceNumber

	public SequenceNumber(int n) {
		a = new int[n];

	}

}
