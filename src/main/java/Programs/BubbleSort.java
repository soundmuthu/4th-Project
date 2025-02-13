package Programs;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myarray[] = {78,87,90,87,54,32,76,97};
		
		int temp;
		
		for(int i=0; i<myarray.length;i++)
		{
			for(int j=1; j<myarray.length-i; j++)
			{
				if(myarray[j-1] > myarray[j])
				{
					temp = myarray[j];
					myarray[j] = myarray[j-1];
					myarray[j-1] = temp;
				}
			}
		}
		
		for(int i=0; i<myarray.length;i++)
		{
			System.out.print(myarray[i]+ " ");
		}
	}

}
