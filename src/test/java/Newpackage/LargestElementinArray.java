package Newpackage;

public class LargestElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarray = {90,788, 987, 87, 100};
		int max = myarray[0];
		int min = myarray[0];
		
		for(int i=0; i<myarray.length;i++)
		{
			if(max<myarray[i])
			{
				max=myarray[i];
			}
			
			
		}
		System.out.println(max);
				
	}
		

}
