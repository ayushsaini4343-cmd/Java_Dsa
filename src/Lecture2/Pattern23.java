package Lecture2;
import java.util.Scanner;

public class Pattern23 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int star=1;
			int space=n-1;
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
				while(j<=star) {
					System.out.print("1 ");
					j++;
				}
				//next line
				star+=2;
				space--;
				row++;
				System.out.println();
			}
		}
	}
}
