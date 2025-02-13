package Newpackage;

public class Swap2NumberswithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=20;
		
		x = x+y;   //x value will be 30 now
		y = x-y;   //y value will be 30-20 = 10
		x= x-y;
		
		System.out.println("the Value of x is:" +x);
		System.out.println("The value of y is: "+y);

	}

}
