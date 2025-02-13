package Newpackage;

public class ReverseaStringwithoutInBuiltFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "soundmuthu";
		String reverse = "";
		char ch;
		
		for(int i=0; i<name.length();i++)
		{
			ch= name.charAt(i);
			reverse = ch + reverse;
		}
		System.out.println(reverse);
		
		String[] myarray = name.split("");
		String reverse1= "";
		for(int i=0; i<myarray.length; i++)
		{
			reverse1= myarray[i]+reverse;
			
		}
		System.out.println(reverse);
	}

}
