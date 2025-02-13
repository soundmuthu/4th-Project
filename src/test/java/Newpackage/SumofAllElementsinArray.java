package Newpackage;

public class SumofAllElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myarray= {90,89,898,89};
		int sum = 0;
		
		for(int i=0; i<myarray.length; i++)
		{
			sum = sum+myarray[i];
		}
		System.out.println(sum);
	}
	

}
