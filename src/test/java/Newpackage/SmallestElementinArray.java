package Newpackage;

public class SmallestElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myarray = {90,30,40,50,60};
		int min= myarray[0];
		
		for(int i=0; i<myarray.length; i++)
		{
			if (min> myarray[i])
			{
				min = myarray[i];
			}
		}
		System.out.println(min);

	}

}
