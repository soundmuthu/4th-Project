package Programs;

public class CountingNoOFWordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "my name is soundmuthu";
		int count = 1;
		
		for(int i=0; i<name.length();i++)
		{
			if(name.charAt(i)==' ' && name.charAt(i+1)!= ' ')
			{
				count = count+1;
				
			}
		}
		System.out.println(count);
	}

}
