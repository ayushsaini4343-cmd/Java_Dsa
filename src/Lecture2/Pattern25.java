package Lecture2;
import java.util.Scanner;

public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				int star=1;
				int space=n-1;
				int row=1;
				int str=1;
				while(row<=n) {
					//space
					int i=1;
					while(i<=space) {
						System.out.print("\t");
						i++;
					}
					//star
					int j=1;
					while(j<=star) {
						System.out.print(str + "\t");
						j++;
						str++;
					}
					//next line
					star+=2;
					space--;
					row++;
					System.out.println();
				}
}
	
}
