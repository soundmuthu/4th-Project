package Programs;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myarray = { 81,39,36,47,54,89};
		
		int temp ;
		for(int i=0; i<myarray.length;i++)
		{
			for(int j=i+1; j<myarray.length;j++)
			{
				if(myarray[j]<myarray[i])
				{
					temp= myarray[i];
					myarray[i]=myarray[j];
					myarray[j]=temp;
				}
			}
		}
		
		System.out.println("The sorted array is:");
		for(int i=0; i<myarray.length;i++)
		{
			System.out.print(myarray[i]+ " ");
		}
		
	}
}
