package Newpackage;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] value = {34,43,56,22,21,12,1};
		int length= value.length;
		
		int count ;
		for(int i=0; i<length-1;i++)
		{
			for(int j=0; j<length-1;j++)
			{
				if(value[j]>value[j+1])
				{
					count= value[j];
					value[j]=value[j+1];
					value[j+1]=count;
				}
			}
		}
		System.out.println("Values after sorting :" +Arrays.toString(value));
	}

}
