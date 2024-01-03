package ABCDCompany;

public class EmployeeManager {
	private int capacity;
	private int size;
	private Employee[] arr;
	EmployeeManager(int capacity) {
		this.capacity=capacity;
		arr=new Employee[capacity];
		size=0;
		}
	public void addEmployee(String name,double Salary) {
		arr[size]=new Employee(name,Salary);
		System.out.println("New employee is added new employees id is "+arr[size].getId());
		size++;
	}
	public void searchEmployee(int id) {
		for(int i=0;i<size;i++) {
			if(arr[i].getId()==id) {
				System.out.println("Employee ID: " + arr[i].getId());
	            System.out.println("Employee Name: " + arr[i].getName());
	            System.out.println("Employee Salary: " + arr[i].getSalary());
			}
		}
	}
	public void diplayEmployee() {
		for(int i=0;i<size;i++) {
			System.out.println(arr[i].getName());
		}
	}

}
