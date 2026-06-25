package Assignment;

import java.util.Scanner;

public class Pattern_Mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star=1;
		int space=n+1;
		int row=1;
		while(row<=n) {
			//star
			int i=1;
			int var=1;
			while(i<=star) {
				System.out.print(var+"\t");
				i++;
				var++;
			}
			//space
			int j=1;
			while(j<=space) {
				System.out.print("\t");
				j++;
			}
			//star
			int nvar=row;
			int k=1;
			if(row==n) {
				k=2;
				nvar--;
			}
			while(k<=star) {
				System.out.print(nvar+"\t");
				k++;
				nvar--;
			}
			//Next Line
			row++;
			star++;
			space-=2;
			System.out.println();
		}
	}

}
