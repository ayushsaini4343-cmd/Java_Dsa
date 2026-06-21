package Lecture2;
import java.util.*;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
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
					
					// Next line
					space--;
					star+=2;
					row++;
					System.out.println();
				}
	}

}
