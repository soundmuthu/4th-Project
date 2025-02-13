package Programs;

public class ReversingaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="muthukrishnan";
		StringBuffer name1= new StringBuffer();
		name1.append(name);
		
		StringBuffer reverse = name1.reverse();
		System.out.println(reverse);
	}

}
