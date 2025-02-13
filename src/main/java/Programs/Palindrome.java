package Programs;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "muthukrishnan";
		String[] myarray = name.split("");
		String rev = "";
		for(int i=0; i<myarray.length;i++)
		{
			rev = myarray[i] + rev;
		}

		System.out.println(rev);
	}

}
