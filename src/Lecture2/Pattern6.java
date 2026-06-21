package Lecture2;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int space=0;
		int star=n;
		int row=1;
		while(row<=n) {
			// Space
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			// Star
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			// Next Line
			space+=2;
			star--;
			row++;
			System.out.println();
		}
	}

}
