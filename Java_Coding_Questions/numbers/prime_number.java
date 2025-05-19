
// prime number is which is divsible by 1 and its known number like 13 is divisible by 1 and 13 

package numbers;
public class prime_number {
	public static void main(String[] args) {
		int a=13;
		boolean is_prime=true;
		for (int i=2;i<a;i++){
			if(a%i==0){
				is_prime=false;
				break;
			}
		}
		if(is_prime==true){
			System.out.print("yes");
		}
		else{
			System.out.print("NO");
		}
	}
}
