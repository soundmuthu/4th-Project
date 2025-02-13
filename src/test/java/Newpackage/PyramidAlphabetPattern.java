package Newpackage;

public class PyramidAlphabetPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		for(int i=1; i<=num;i++)
		{
			char ch='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}

}
