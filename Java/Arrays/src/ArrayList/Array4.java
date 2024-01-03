package ArrayList;
import java.util.*;

public class Array4 {

	public static void main(String[] args) {
		HashSet al=new HashSet();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		Iterator ite=al.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		ListIterator litr=al.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println(al);

	}

}
