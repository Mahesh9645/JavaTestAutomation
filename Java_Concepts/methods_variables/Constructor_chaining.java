package methods_variables;

class person {
	String name ;
	int age;
	
	person(int age,String name){
		this.age=age;
		this.name=name;
	}
	
}
class details extends person{
    int emp_id;
    String company_name;
    
    details(int emp_id,String company_name,int age,String name){
    	super(age,name);
    	this.emp_id=emp_id;
    	this.company_name=company_name;	
    }
	


void display() {
	System.out.print(emp_id+" "+company_name+" "+age+" "+name);
}
}
public class Constructor_chaining{
	
	public static void main(String[] agrs) {
		details d =new details(20 ,"tv2z",34,"kalyan");
		
		d.display();
	}
	
}