package numbers;

public class Reverse {

	public static void palindrom(int a) {
		int n=a;
		int rev=0;
		while(n>0) {
			int digit =n%10;//(Remainder is 1)
			rev=rev*10+digit;
			n=n/10;// it will remove the last number
			
		}
		//System.out.println(rev);
	           if(rev==a) {
	        	   System.out.println(a+"  : it is palindrom");
	           }
	           else {
	        	   System.out.println(a+"  : it is not palindrom");
	           }
	}
	
	public static void btween_palindrom(int a, int b) {
		for (int i=a;i<=b;i++) {
			int n=i;
			int rev=0;
			while(n>0) {
				int digit =n%10;//(Remainder is 1)
				rev=rev*10+digit;
				n=n/10;// it will remove the last number
				
			}
		           if(rev==i) {
		        	   System.out.println(i+"  : it is palindrom");
		           }
		}
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		palindrom(121);
		
		btween_palindrom(0,1000);
		
	}
}


//
