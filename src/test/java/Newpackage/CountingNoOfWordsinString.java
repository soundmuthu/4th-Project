package Newpackage;

public class CountingNoOfWordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "muthu krishnan";
		int count = 0;
		
		for(int i=1; i<=name.length();i++)
		{
			if(name.charAt(i)!=' ' && name.charAt(i+1)!=' ')
			{
				count=count+1;
			}
		}
		System.out.println(count);

	}

}
