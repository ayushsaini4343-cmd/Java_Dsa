package lecture1;

public class Increment_Decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6;
		int x = a-- + 7 + a-- + 8 + a++;
		System.out.println(x);
		
		int b=19;
		int y= b++ + --b + ++b + 11 + b++ - b-- + ++b;
		System.out.println(y);
	}

}
