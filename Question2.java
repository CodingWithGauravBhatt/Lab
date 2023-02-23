package Today23Feb;

class Employee{
	double IncreamentSalary  () {
		return 0;
	}
}
class Developer extends Employee{
	double IncreamentSalary () {
		return 8000.50;
	}
}
class Manager extends Employee{
	double IncreamentSalary () {
		return 700.60;
	}
}
public class Question2 {
public static void main(String[] args) {
	Employee employee;
	employee = new Developer();
	System.out.println("Developer Increamented Salary ="+" "+employee.IncreamentSalary());
	employee = new Manager();
	System.out.println("Manager Increamented Salary ="+" "+employee.IncreamentSalary());
}
}
