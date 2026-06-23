package Lecture3;

import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space=n-1;
		int star=1;
		int row=1;
		while(row<=n) {
			//space
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			//star
			int j=1;
			int var=1;
			while(j<=star) {
				System.out.print(var+" ");
				if(j<=star/2) {
					var++;
				}
				else {
					var--;
				}
				j++;
				
			}
			//next line
			row++;
			star+=2;
			space--;
			System.out.println();
			
		}
	}

}
