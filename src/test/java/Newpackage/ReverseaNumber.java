package Newpackage;

public class ReverseaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 67567;
		int rev= 0;
		
		while(num!=0)
		{
			
			//System.out.println(digit);
			rev = rev*10 + num%10;
			System.out.println(rev);
			
			num = num/10;
			System.out.println(num);
		}
		System.out.println(rev);
	}

}
