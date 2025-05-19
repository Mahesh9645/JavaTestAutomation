/*polymorphism = One thing showing multiple behaviour is called as polymorphism
poly = many ,morphism = form 

. Compile time polymorphism :
-----------------------------
During compile time one thing showing multiple behaviour is called as
compile time polymorphism.
ex: method overloading, where during compilation, compiler will decide
which behaviour to be implemented so here methodname is same but depending
on type of args it shows different behaviour.
run()
run(int i)
run(char ch)
run(String s,int i)

*/
package oops;

public class Poly_MethodOverloading {

    // Method with one parameter
    public void booking(String ticketCopy) {
        System.out.println("Ticket Xerox: " + ticketCopy);
    }

    // Method with two parameters
    public void booking(String ticketCopy, int idProof) {
        System.out.println("This is my ticket: " + ticketCopy + ", and my ID number is: " + idProof);
    }

    // Method with three parameters
    public void booking(String ticketCopy, int idProof, String boardingPass) {
        System.out.println("This is my ticket: " + ticketCopy + 
                           ", my ID number: " + idProof + 
                           ", and my boarding pass: " + boardingPass);
    }

    // Method with no parameters
    public void booking() {
        System.out.println("I don’t have a ticket.");
    }

    public static void main(String[] args) {
    	Poly_MethodOverloading py = new Poly_MethodOverloading();
        
        // Calling overloaded methods
        py.booking();
        py.booking("Flight Ticket");
        py.booking("Train Ticket", 98765432);
        py.booking("Bus Ticket", 12345678, "Hyderabad");
    }
}

 