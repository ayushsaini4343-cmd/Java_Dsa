package Assignment;

import java.util.Scanner;


public class Pattern_Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star=n;
		int space=-1;
		int row=1;
		while(row<=n*2-1) {
			//star
			int i=1;
			while(i<=star) {
				System.out.print("*");
				i++;
			}
			//space
			int j=1;
			while(j<=space) {
				System.out.print(" ");
				j++;
			}
			//star
			int k=1;
			if(row==1 || row==n*2-1) {
				k=2;
			}
			while(k<=star) {
				System.out.print("*");
				k++;
			}
			//mirror
			if(row<n){
				star--;
				space+=2;
			}
			else {
				star++;
				space-=2;
			}
			//Next Line
			row++;
			System.out.println();
		}
	}

}
