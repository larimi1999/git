package Assingment6_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		int n, key;
		List<Officials> arr = 	new ArrayList<Officials>();
		List<Staffs> arr1 = 	new ArrayList<Staffs>();
		List<Professors> arr2 = new ArrayList<Professors>();
		boolean kt = false;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.Put in Officials.");
			System.out.println("2.Put in Professors.");
			System.out.println("3.Search with Name and Department .");
			System.out.println("4.Show List Professors and sorting by name .");
			System.out.println("5.Exit.");
			key = sc.nextInt();
			switch (key) {
			case 1: {
				System.out.println("Put in Quatity : ");
				n = sc.nextInt();

				for (int i = 0; i < n; i++) {
					System.out.println("Put in information about Staff " + (i + 1) + ":");
					Officials s = new Officials();
					s.input();
					arr1.add(s);
					arr.add(s);
				}
				int a = 0;
				for (Officials officials : arr) {
					System.out.println("-----------------------------");
					System.out.println("Information Official " + (a + 1) + " : ");
					officials.print();
					a++;

				}
				kt = false;
				break;

			}
			case 2: {
				System.out.println("Put in Quatity : ");
				n = sc.nextInt();

				for (int i = 0; i < n; i++) {
					System.out.println("Put in information about Professor " + (i + 1) + ":");
					Professors p = new Professors();
					p.input();
					arr2.add(p);
					arr1.add(p);
				}
				int b = 0;
				for (Professors professors : arr2) {
					System.out.println("-----------------------------");
					System.out.println("Information Professor " + (b + 1) + " : ");
					professors.print();
					b++;

				}
				kt = false;
				break;

			}
			case 3: {
			
				
				sc.nextLine();
				System.out.println("Put in Name or Department name be search");
				String Key =sc.nextLine();
				if(arr.isEmpty())
				{
					System.out.println("List is Empty");
					break;
				}
				List<Staffs>    Result  = arr1.stream().filter(Staffs -> Staffs.getFullName().equals(Key))
						.collect(Collectors.toList());
				List<Officials> Result1 = arr.stream().filter(Officials -> Officials.getDepartment().equals(Key))
						.collect(Collectors.toList());
				
				
				if (Result.isEmpty() && Result1.isEmpty()) {
					System.out.println("Not Found 1!");
				} 
				
				for (Staffs d : Result) {
					System.out.println("Information " + Key + ":");
					d.print();
				}
				for (Officials c : Result1) {
					System.out.println("Information Department " + Key + ":");
					c.print();
				}
				kt = true;
				break;
			
			}
			case 4: {
				
				int k = 0;
				for (Professors c : arr2) {
					System.out.println("--------------------------------");
					System.out.println("information Proffessor" + (k + 1) + ": ");
					c.print();
					k++;
				}
				System.out.println("Sorting by Name...");
				Collections.sort(arr2, new NameComparator());
				for (Professors c : arr2) {
					c.print();
				}
				kt = true;
				break;
			}
			case 5: {
				kt = false;
				break;
			}
			default: {
				kt = false;
				break;
			}



			}
		} while (kt == false || key > 5 || key <0);

	}
}


