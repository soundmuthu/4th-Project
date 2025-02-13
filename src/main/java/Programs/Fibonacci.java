package Programs;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1= 0;
		int num2 =1;
		int num3;
		int count = 5;
		
		for(int i=0; i<=count; i++)
		{
			num3 = num1+ num2;
			System.out.println(num3);
			num1 = num2;
			num2= num3;
		}
	}

}
