package Newpackage;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "kayak";
		String[] myarray = name.split("");
		
		String rev = "";
		
		for(int i=0; i<myarray.length;i++)
		{
			rev = myarray[i]+rev;
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
