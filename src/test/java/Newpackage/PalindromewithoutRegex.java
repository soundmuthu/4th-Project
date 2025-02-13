package Newpackage;

public class PalindromewithoutRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name= "sound";
		char ch;
		String rev = "";
		
		for(int i=0; i<name.length();i++)
		{
			ch=name.charAt(i);
			rev= ch+ rev;
		}
		System.out.println(rev);
		
		if(name.equals(rev))
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
	}

}
