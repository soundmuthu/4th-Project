package Newpackage;

import java.util.Random;

public class GenerateRandomMobileNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Random random = new Random();
	StringBuilder mobilenumber = new StringBuilder();
	
	for(int i=0; i<10; i++)
	{
		random.nextInt(10);
		mobilenumber.append(random.nextInt(10));
	}
	System.out.println(mobilenumber);
	}
	

}
