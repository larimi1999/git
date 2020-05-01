import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		ArrayList<Account> accounts = new ArrayList();		
		ArrayList<Department> departments = new ArrayList() ;	
		Scanner sc = new Scanner(System.in);
		ArrayList<Group> groupofAccounts 	= new ArrayList();
		ArrayList<Account> Accountofgroup1s = new ArrayList();		
		ArrayList<Account> Accountofgroup2s = new ArrayList();	
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
		groupofAccounts.add(group1);

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "C# Fresher";
		groupofAccounts.add(group2);
		// create account
		Account account2 = new Account();
		account2.id = 1;
		account2.email = "NguyenVanA@gmail.com";
		account2.department = department2;
		account2.position 	= "Fresher";
		account2.fullName 	= "Ngo Trung Nhat";
		account2.userName   = "Nhat Alone";
		//add
		accounts.add(account2);
		
		
		Account account1 = new Account();
		account1.id = 2;
		account1.email = "NguyenVanB@gmail.com";
		account1.department = department1;
		account1.position = "Dev";
		account1.fullName = "Ngo Kim Chung";
		account1.userName ="Nhat Dep Trai";
		//
		accounts.add(account1);
		
		while(true)
		{
			System.out.println("Nhap vao su lua chon : ");
			System.out.println("1.Tao  account");
			System.out.println("2.Tao  department");
			System.out.println("3.Them group vao account");
			System.out.println("4.Question 4");
			int choose = sc.nextInt();
			switch(choose) 
			{
				case 1 : 
				{
					System.out.println("Nhap vao so account muon tao : ");
					int n = sc.nextInt();
					for(int i = 0;i<n ; i++)
					{
						Account account = new Account();
						System.out.println("Nhap vao ID:");
						account.id = sc.nextInt();
						System.out.println("Nhap vao FullName:");
						sc.nextLine();
						account.fullName=sc.nextLine();
						accounts.add(account);
					}
					System.out.println("-------------------------------------");
					//Print().
					//System.out.println(accounts.get(0).id);
					break;
					
				}
				case 2 : 
				{
					
				}
				case 3 : 
				{
					System.out.println("Bạn có muốn thực hiện chức năng khác khong ? ")	;
					System.out.println("1.Co");
					System.out.println("2.Khong");
					int choose1 = sc.nextInt();
					if(choose1==1)
					{
						break;
					}
					if(choose1==2)
					{
						System.exit(0);
					}
				}
				case 4 : 
				{
					//Question 11 : 
					for (Account account : accounts) {
						System.out.println(account.userName);					
					}
					System.out.println("Nhap vao user cua account");
					sc.nextLine();
					String nhap = sc.nextLine();
				
					
					System.out.println("Chuong trinh chon ngau nhien 1 group");
					Random random = new Random();
					int i = random.nextInt(2);	
					System.out.println(groupofAccounts.get(i).name);
					if(i==0)
					{
						for (Account ac : accounts) {
							if(ac.userName.equals(nhap))
							{
								Accountofgroup1s.add(ac);
							}
						}
					}
					
					if(i==1)
					{
						for (Account az : accounts) {
							if(az.userName.equals(nhap))
							{
								Accountofgroup2s.add(az);
							}
						}
					}
					if(Accountofgroup1s.size()==1)
					{
						System.out.println(Accountofgroup1s.get(0).fullName);
					}
					
					if(Accountofgroup2s.size()==1)
					{
						System.out.println(Accountofgroup2s.get(0).fullName);
					}
					
				}
				
			}
		}
		
	}
		

}
