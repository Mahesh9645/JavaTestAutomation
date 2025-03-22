package methods_variables;
//constructor overloading 

public class Employee {
	
	    String name;
	    int empId;
	    double salary;
	    String companyName;

	    // Default Constructor (No Arguments)
	    Employee() {
	        this.name = "Unknown";
	        this.empId = 0;
	        this.salary = 0.0;
	        this.companyName = "Not Assigned";
	    }

	    // Constructor with name and empId
	    Employee(String name, int empId) {
	        this.name = name;
	        this.empId = empId;
	        this.salary = 0.0;  // Default value
	        this.companyName = "Not Assigned";  // Default value
	    }

	    // Constructor with all parameters
	    Employee(String name, int empId, double salary, String companyName) {
	        this.name = name;
	        this.empId = empId;
	        this.salary = salary;
	        this.companyName = companyName;
	    }

	    // Display method
	    void display() {
	        System.out.println(name + " " + empId + " " + salary + " " + companyName);
	    }

	    public static void main(String[] args) {
	        Employee emp1 = new Employee();  // Calls Default Constructor
	        Employee emp2 = new Employee("Navya", 101);  // Calls 2nd Constructor
	        Employee emp3 = new Employee("Sai", 102, 60000, "People Tech");  // Calls 3rd Constructor

	        emp1.display();
	        emp2.display();
	        emp3.display();
	    }
	
}