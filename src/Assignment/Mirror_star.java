package Assignment;

import java.util.Scanner;

public class Mirror_star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star=1;
		int space=n/2;
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
			while(j<=star) {
				System.out.print("*"+"\t");
				j++;
			}
			
			//mirror
			if(row<n/2+1) {
				star+=2;
				space--;
			}
			else {
				star-=2;
				space++;
			}
			
			//next line
			row++;
			System.out.println();
		}
	}

}
