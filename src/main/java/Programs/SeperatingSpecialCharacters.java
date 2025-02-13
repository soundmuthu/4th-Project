package Programs;

import java.util.ArrayList;
import java.util.List;

public class SeperatingSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "345675uhfdn@#$#$%^";
		
		String[] myarray = name.split("");
		String characterstring = "[a-zA-Z0-9]";
		String numberstring = "[0-9]+";
		
		List<Integer> integerlist = new ArrayList<Integer>();
		List<String> wordlist = new ArrayList<String>();
		List<String> characterlist = new ArrayList<String>();
		
		for(int i=0; i<myarray.length;i++ )
		{
			if(myarray[i].matches(numberstring))
			{
				integerlist.add(Integer.valueOf(myarray[i]));
			}
			else if (myarray[i].matches(characterstring))
			{
				characterlist.add(characterstring);
			}
			else
			{
				wordlist.add(myarray[i]);
			}
		}
		
		for(int i=0; i<integerlist.size();i++)
		{
			System.out.println(integerlist.get(i));
		}
		
		for(int i=0; i<wordlist.size();i++)
		{
			System.out.println(wordlist.get(i));
		}
	}

}
