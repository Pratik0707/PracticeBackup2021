package Collection;
import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		abc alp = new abc();
		alp.arraylistPractice();
	}
}

class abc
{
	void arraylistPractice()
	{
		ArrayList al = new ArrayList(12); //insertion order preserved and duplicates are allowed
		al.add(10);
		al.add("hello");
		al.add('P');
		al.add(10);
		al.add(2, 5);
		ArrayList al2 = new ArrayList();
		al2.add("al2-1");
		al2.add("al2-2");
		al.addAll(3, al2);

		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}		
	}
}