import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
	
		// create department
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Sale";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Marketting";

		// create group
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Java Fresher";

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "C# Fresher";

		// create account
		Account account2 = new Account();
		account2.id = 1;
		account2.email = "NguyenVanA@gmail.com";
		account2.department = department2;
		account2.position 	= "Fresher";
		account2.fullName 	= "Ngo Trung Nhat";
		account2.userName   = "Nhat Alone";

		Account account1 = new Account();
		account1.id = 2;
		account1.email = "NguyenVanB@gmail.com";
		account1.department = department1;
		account1.position = "Dev";
		account1.fullName = "Ngo Kim Chung";
		account1.userName ="Nhat Dep Trai";
		

		Group[] groupOfAccount2 = { group1, group2 };
		account2.groups = groupOfAccount2;

		Account[] Accountofgroup1 = { account1, account2 };

		Account[] Accountofgroup2 = { account2 };
		
		Account[] allaccounts  	  = {account1,account2};

	
		account2.gender = Gender.MALE; // enum
		
		for (Account account : allaccounts) {
			System.out.println(account.userName);
		}
		
		
		Account account3 = new Account();
		System.out.println("Nhap vao User Name ; ");
		Scanner sc = new Scanner(System.in);
		account3.userName = sc.nextLine();
		
		
		Group[] groups   = {group1,group2};
		Group group = new Group();
		for (Group gr : groups) {
			System.out.println(gr.name);
		}
		
		Group group3 = new Group();
		System.out.println("Nhap vao ten Group");
		group3.name =  sc.nextLine();
		System.out.println(group3.name);
	
		
	}
}
