//Program to demonstrate static variables
package non.access_modifiers.staticblok.Company_details;

public class EmployeeDemo {

	public static void main(String[] args) {
		// Create the first object of the class and pass the two arguments with type
		// string and int.
		//System.out.println(Employee.companyName);
		Employee e = new Employee("Aadi", 001);
		System.out.println(e);
		
		// Similarly, create the second object of the class and pass the two arguments.
		e = new Employee("Dayan", 002);
		System.out.println(e);
	}
}