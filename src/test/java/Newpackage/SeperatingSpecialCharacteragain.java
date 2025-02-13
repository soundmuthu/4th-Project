package Newpackage;

import java.util.ArrayList;
import java.util.List;

public class SeperatingSpecialCharacteragain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "345675uhfdn@#$#$%^";
		
		String[] myarray = name.split("");
		
		String characterstring = "[a-zA-Z0-9]";
		String integerstring = "[0-9]+";
		
		List<Integer> integerlist = new ArrayList<Integer>();
		List<String> characterlist = new ArrayList<String>();
		List<String> wordlist = new ArrayList<String>();
		
		for(int i=0; i<myarray.length;i++)
		{
			
			if(myarray[i].matches(integerstring))
			{
				integerlist.add(Integer.valueOf(myarray[i]));
			}
			else if(myarray[i].matches(characterstring))
			{
				characterlist.add(myarray[i]);
			}
			else
			{
				wordlist.add(myarray[i]);
			}
		}
		
		for(int i=0; i<characterlist.size();i++)
		{
			System.out.print(characterlist.get(i));
		}
		System.out.println();
		
		for(int i=0; i<integerlist.size();i++)
		{
			System.out.print(integerlist.get(i));
		}
		System.out.println();
		
		for(int i=0; i<wordlist.size();i++)
		{
			System.out.print(wordlist.get(i));
		}
		System.out.println();
	}

}
