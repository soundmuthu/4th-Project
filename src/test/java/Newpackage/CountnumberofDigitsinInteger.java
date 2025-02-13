package Newpackage;

public class CountnumberofDigitsinInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mynumber = 23453;
		
	    int count = 0;
	    
	    while(mynumber != 0)
	    {
	     mynumber = mynumber/10;
	     count++;
	    }
	    System.out.println(count);
	}

}
