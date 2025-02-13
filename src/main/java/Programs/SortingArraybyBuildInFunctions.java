package Programs;

import java.util.Arrays;

public class SortingArraybyBuildInFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarray = { 89, 78, 90, 91, 83, 56, 64};
		
		Arrays.toString(myarray);
		System.out.println("The Arrays before sorting are:" +Arrays.toString(myarray));
		Arrays.parallelSort(myarray);
		System.out.println("The Arrays afer sorting are:" +Arrays.toString(myarray));
		
		int a[] = {200,100,90,89,789,876,56,76,89,988};
		System.out.println("The Arrays before sorting are:" +Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("The Arrays afer sorting are:" +Arrays.toString(a));
	}

}
