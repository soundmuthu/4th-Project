package Newpackage;

public class PalindromeforNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num= 98789;
		int newnum = num;
		int revnum = 0;
		
		while(num!=0)
		{
			int digit = num%10;
			System.out.println(digit);
			
			revnum = revnum*10 + digit;
			System.out.println(revnum);
			
			num = num/10;
			System.out.println(num);
		}
		System.out.println(revnum);
		
		if(newnum==revnum)
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
	}

}
