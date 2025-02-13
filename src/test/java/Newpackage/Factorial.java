package Newpackage;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int fact=1;
		
		for(int i=1; i<=n; i++)
		{
			fact = i* fact;
			//System.out.println(fact);
		}
		System.out.println(fact);

	}

}
