package Lecture3;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space=n-1;
		int star=1;
		int row=1;
		while(row<=n*2-1) {
			//space
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
				
			}
			//star
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			//mirror
			if(row<n) {
				space--;
				star++;
			}
			else {
				space++;
				star--;
			}
			//next line
			row++;
			System.out.println();
		}
	}

}
