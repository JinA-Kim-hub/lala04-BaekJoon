package step10_2439_별_찍기_2;

import java.util.Scanner;

//별찍기2

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		for(int i=1; i<=N ; i++) {
			//공백
			for(int j=N ; j>i ;j-- ) {
				System.out.print(" ");
			}
			
			//별
			for(int j=1 ; j<=i ; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		s.close();
	}
}
