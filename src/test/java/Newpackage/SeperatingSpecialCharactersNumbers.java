package Newpackage;

import java.util.ArrayList;
import java.util.List;

public class SeperatingSpecialCharactersNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "@#$%3456656soundmuthu";
		
		String[] myarray= name.split("");
		
		String specialcharacter = "[a-zA-Z0-9]";
		String numbercharacter = "[0-9]+";
		
		List<Integer> numberlist = new ArrayList<Integer>();
		List<String> characterlist = new ArrayList<String>();
		List<String> wordlist = new ArrayList<String>();
		
		
		for(int i=0;i<myarray.length;i++)
		{
			if(myarray[i].matches(numbercharacter))
			{
				numberlist.add(Integer.valueOf(myarray[i]));
			}
			else if (myarray[i].matches(specialcharacter))
			{
				characterlist.add(myarray[i]);
			}
			else
			{
				wordlist.add(myarray[i]);
			}
		}
		
		for(int i=0; i<numberlist.size();i++)
		{
			System.out.print(numberlist.get(i));
		}
		System.out.println();
		
		for(int i=0; i<characterlist.size();i++)
		{
			System.out.print(characterlist.get(i));
		}
		System.out.println();
		for(int i=0; i<wordlist.size();i++)
		{
			System.out.print(wordlist.get(i));
		}
		

	}

}
