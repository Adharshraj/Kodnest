package ABCDCompany;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		EmployeeManager em=new EmployeeManager(10);
		boolean abi=true;
		while(abi) {
			System.out.println("Enter 1 for add employee");
			System.out.println("Enter 2 forSearch employee");
			System.out.println("Enter 3 forDisplay employees employee");
			System.out.println("Enter 4 for add exit");
			int in=scan.nextInt();
			if(in==1) {
			System.out.println("Enter name");
			String name=scan.next();
			System.out.println("Enter salary");
			double salary=scan.nextDouble();
			em.addEmployee(name, salary);
			}
			else if(in==2) {
				System.out.println("Enter id");
				int id=scan.nextInt();
				em.searchEmployee(id);
			}
			else if(in==3) {
				em.diplayEmployee();
			}
			else if(in==4){
				abi=false;
			}
		}
	}

}
