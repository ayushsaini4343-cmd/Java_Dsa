package lecture1;

public class Max_3_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 32;
		int c = 20;
		if(a>b && a>c) {
			System.out.println("a is greater");
		}
		else if(a<b && b>c) {
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
		}
	}

}
