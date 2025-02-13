package Newpackage;

public class Divisibleby2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {890, 987, 786, 564, 346, 213, 324, 542};
		int count = 0;
		
		for(int i=0; i<numbers.length;i++)
		{
			if(numbers[i]%2==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
