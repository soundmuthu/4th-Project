package Newpackage;

public class CountNoOFWordspresentinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String value = "my name is soundmuthu";
		String[] myarray = value.split(" ");
		int count = 0;
		
		for(int i=0; i<myarray.length;i++)
		{
			count=count+1;
			//System.out.print(myarray[i]);
		}
		System.out.println(count);
	}

}
