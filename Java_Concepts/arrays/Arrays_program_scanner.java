package arrays;

import java.util.Scanner;

public class Arrays_program_scanner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the number");
		int size=s.nextInt();
		int s1[]= new int[size];
		for (int i=0;i<=s1.length-1;i++) {
			s1[i]=s.nextInt();
		}
		for(int j=0;j<=s1.length-1;j++) {
			System.out.println(s1[j]);
		}
	}

}
