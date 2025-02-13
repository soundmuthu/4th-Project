package Programs;

public class CountNoofDigitsinInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mynum = 9876236;
		
		int count = 0;
		
		while(mynum!=0)
		{
			mynum= mynum/10;
			count=count+1;
		}
		System.out.println(count);
	}

}
