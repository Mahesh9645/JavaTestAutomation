/*
---- No we cannot change syntax of main method
-----No we cannot keep main method as private because private fields cannot be accessed from outside of class.
----No we can't write main method as non static because if method is non static, we have to create an object and JVM 
can't create object on its own to access main method.

*/
package module_1;
public class Datatypes {

	public static void main(String[] args) {
		byte b = 10;
		short s = 200;
		int i = 50000;
		long l = 1000000000L;
		float f = 3.14f;
		double d = 3.141592653;
		char c = 'A';
		boolean isJavaFun = true;
		String S1="welcome to java programming";
		System.out.println("Byte ="+b+",short ="+s+",int = "+i+",long ="+l+",float ="+f+",double = "+d+",char ="+c+",boolean ="+isJavaFun+",String  ="+S1);

	}

}
