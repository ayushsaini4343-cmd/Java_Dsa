package Assignment;

import java.util.Scanner;

public class Hollow_Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star=n/2+1;
		int space=-1;
		int row=1;
		while(row<=n) {
			//star
			int i=1;
			while(i<=star) {
				System.out.print("*\t");
				i++;
			}
			//space
			int j=1;
			while(j<=space) {
				System.out.print("\t");
				j++;
			}
			//star
			int k=1;
			if(row==1 || row==n) {
				k=2;
			}
			while(k<=star) {
				System.out.print("*\t");
				k++;
			}
			//mirror
			if(row<n/2+1) {
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
