package Newpackage;

public class LargestandSmallestNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers= {45,76,890,432,445,765,653};
		
		int maxnumber = numbers[0];
		int minnumber = numbers[0];
		
		for(int i=0; i<numbers.length;i++)
		{
			if(maxnumber<numbers[i])
			{
				maxnumber= numbers[i];
			}
			else if(minnumber>numbers[i])
			{
				minnumber=numbers[i];
			}
		}
		System.out.println(maxnumber);
		System.out.println(minnumber);
	}

}
