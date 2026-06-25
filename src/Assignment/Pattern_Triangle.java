package Assignment;

import java.util.Scanner;

public class Pattern_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star=1;
		int space=n-1;
		int row=1;
		while(row<=n) {
			//space
			int i=1;
			while(i<=space) {
				System.out.print("\t");
				i++;
			}
			//star
			int j=1;
			int var=row;
			while(j<=star) {
				System.out.print(var+"\t");
				if(j<star/2+1) {
					var++;
				}
				else {
					var--;
				}
				j++;
			}
			//Next Line
			System.out.println();
			star+=2;
			space--;
			row++;
			
		}
	}

}
