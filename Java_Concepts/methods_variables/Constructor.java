/*
Definition
‐‐‐‐‐‐‐‐‐‐‐
⦁ Constructor is a special type of method which gets executed
whenever we created an object
⦁ The main purpose of constructor is to initialise a non static
variable.

Key points 
============
1. Constructor can be public, private, protected or default.
2. Constructor cannot be static, non static, final or abstract.
3. Constructor name must be same as that of classname.
4. Constructor does not have any return type not even void.
5. Constructor can be with arguments or without arguments.

Syntax: AccessModifier consructoname(arg/no args)
   {
      //body of constructor
    }


*/
package methods_variables;
public class Constructor {  // Class name should start with a capital letter (Java convention)
    
    // Instance variables (now accessible throughout the class)
    String name;
    int emp_id;
    double salary;
    String company_name;

    // Constructor (assigns values to instance variables)
   /* public Constructor() {
        age = 10; 
        name = "Navya";
    }*/
    
   /*public Constructor(int age1,String name1) {
    	age=age1;
    	name=name1;
    	name , age , emp id , salary ,company name 
    }*/
    public Constructor(String name1,int emp_id1,double salary1,String company_name1) {
    	name=name1;
    	emp_id=emp_id1;
    	salary=salary1;
    	company_name=company_name1;
    }
    
    public static void main(String[] args) {
    	
    	Constructor obj = new Constructor("Nithya",502,45000,"Tv2z");
    	Constructor obj1 = new Constructor("Sai",500,65000,"people tech");
    	System.out.println(obj.name+" "+obj.emp_id+" "+obj.company_name+" "+obj.salary);
    	System.out.println(obj1.name+" "+obj1.emp_id+ " "+obj1.company_name+" "+obj1.salary);
    	
    	
       /* Constructor con = new Constructor(30,"Navya");
        Constructor con1 = new Constructor(29,"Mahesh");
        Constructor con2 = new Constructor(10,"java");
        
        // Now these variables are accessible because they are instance variables
        System.out.println(con.age+con.name);
        System.out.println(con1.age+con1.name);
        System.out.println(con2.age+con2.name);*/
        
    }
}
	
	
	
	
