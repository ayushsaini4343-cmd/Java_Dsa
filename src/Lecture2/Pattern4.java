package Lecture2;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int space=n-1;
		int star=1;
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
			space--;
			star++;
			row++;
			System.out.println();
		}
	}

}
