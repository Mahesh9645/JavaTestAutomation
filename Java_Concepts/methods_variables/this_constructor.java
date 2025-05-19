package methods_variables;
public class this_constructor {  // Class name should start with a capital letter (Java convention)

	// Instance variables (now accessible throughout the class)
	String name;
	int emp_id;
	double salary;
	String company_name;


	public this_constructor(String name,int emp_id,double salary,String company_name) {
		this.name=name;
		this.emp_id=emp_id;
		this.salary=salary;
		this.company_name=company_name;
	}

	public static void main(String[] args) {

		this_constructor obj = new this_constructor("Nithya",502,45000,"Tv2z");
		this_constructor obj1 = new this_constructor("Sai",500,65000,"people tech");
		
		System.out.println(obj.name+" "+obj.emp_id+" "+obj.company_name+" "+obj.salary);
		System.out.println(obj1.name+" "+obj1.emp_id+ " "+obj1.company_name+" "+obj1.salary);



	}
}


