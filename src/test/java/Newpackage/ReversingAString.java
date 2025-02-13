package Newpackage;

public class ReversingAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "muthukrishnan";
		StringBuffer value1= new StringBuffer();
		value1.append(value);
		
		System.out.println(value1);
		StringBuffer reverse = value1.reverse();
		System.out.println(reverse);
		

	}

}
