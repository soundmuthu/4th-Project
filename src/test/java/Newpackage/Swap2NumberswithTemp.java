package Newpackage;

public class Swap2NumberswithTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value1 = 20;
		int value2 = 30;
		
		int temp = 0;
		
		temp = value1;
		value1=value2; 
		value2=temp;
		
		System.out.println("the value 1 is : "+ value1);
		System.out.println("the value 2 is : "+ value2);
	}

}
