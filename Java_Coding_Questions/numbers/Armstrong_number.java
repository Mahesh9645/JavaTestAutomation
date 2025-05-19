/*
 """An Armstrong number (or Narcissistic number) is a number that is equal to the sum of its own 
digits each raised to the power of the number of digits."""
 * 
 */

package numbers;

public class Armstrong_number {
//given code check whether number is Armstrong or not
	public static void find_armstong(int a) {	
		
		int n= a;
		int temp  = n;
		int sum=0;
		// 153 = (1)3 + (5)3 + (3)3 =153
		
		int b=String.valueOf(n).length();
		
		while(n>0) {
		int digit =n% 10;
		sum += Math.pow(digit, b);
		n=n/10;
		
		}
		if (sum == temp) {
			System.out.println("Armstrong number ");
			
		}
		else {
			System.out.println("its not arm strong number");
		} 
	}
	
	//Below code check Armstrong numbers between given arguments
	public void between_armstrong(int a,int b) {
		for (int i = a; i <= b; i++) {
			int temp = i;
			int sum = 0;

			int number_length=String.valueOf(i).length();

			while (temp > 0) {
				int digit = temp % 10;
				sum += Math.pow(digit, number_length);
				temp = temp / 10;
			}

			if (sum == i) {
				System.out.println(i + " is an Armstrong number");
			}

		}

	}
	
	public static void main(String[] args) {
		find_armstong(9474);//its a static method so iam calling direct into main static
		
		Armstrong_number Ar = new Armstrong_number();//its a non static method so iam creating a class to obejct
		Ar.between_armstrong(100, 10000);//then iam calling non-static method


	}

}
