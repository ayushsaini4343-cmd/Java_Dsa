package Lecture2;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star=1;
		int space=n*2-3;
		int row=1;
		while(row<=n) {
			//Star
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			//Space
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			//Star
			int k=1;
			if(row==n) {
				k=2;
			}
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			//Next Line
				star++;
				space-=2;
				row++;
				System.out.println();
				
		}
	}

}
