package Assignment;

import java.util.Scanner;

public class Number_Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		int star=1;
		int var=1;
		while(row<=n) {
			//star
			int i=1;
			while(i<=star) {
				System.out.print(var+"\t");
				i++;
				var++;
			}
			//next line
			row++;
			star++;
			System.out.println();
			
		}
	}

}
