package ABCDCompany;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private static int idGenerator=1000;
	void setId() {
		id=idGenerator;
	}
	void setName(String str) {
		name=str;
	}
	void setSalary(double sa) {
		salary=sa;
	}
	int getId() {
		return id;
	}
	String getName() {
		return name;
	}
	public Employee(String name,double salary) {
		this.id=++idGenerator;
		this.name=name;
		this.salary=salary;
	}
	double getSalary() {
		return salary;
	}
	
}
