/*
Local variable = Declared inside method(Main method () or user method ()) and within the class
--->local variable cannot be called outside of the method.

Global variable = Declared outside the method  and within the class.
---> Static 

Is intialisation of global variable is mandatory?
A. They are not mandatory to intialise, if we did not intialise, JVM will take default values based on data types.
byte,short,int and long --------> 0
float and double ------------> 0.0
String ---------------------> null
boolean ---------------------> false
char ---------------------> empty space


Global variables can be public, default, private, protected and final
-Global variables are also called as Data members.


If local var and global var names are same first priority is always given to local variables because they are
inside method and nearer for execution to JVM

Conclusion points
‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐
1. static variables can be accessed directly in static methods
2. static variables can be accessed directly in non static methods
3. Non static variables cannot be accessed directly in static methods
4. Non static variables can be accessed directly in non static methods
5. static method can be called directly from static methods
6. static method can be called directly from non static methods
7. Non static method cannot be called directly from static methods

*/
package methods_variables;


public class Variables {
    static int a= 30;   // global variable 
    
    int d= 40;
	public static void add() {// static method 
		int a = 10 ; //local variable
		System.out.println(a);
	}
	
	public  void sub() {// non-static method 
		int b = 20 ; //local variable
		System.out.println(b);
	}
	
	public static void main(String[] args) {
	 add(); // for between global variable and local variable always refer to local variable
	 
	 Variables v = new Variables(); // non static will create object
	 v.sub();
	 add();
	 System.out.println(a); // call a global variable with static keyword
	 System.out.println(v.d);// for non static global variable we need to create object(ref 37 line)
     
	}

}
