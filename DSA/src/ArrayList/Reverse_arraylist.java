package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse_arraylist {
	static void reverse_ary_list(ArrayList<Integer> list) {
		int i = 0;
		int j = list.size() - 1;

		while (i < j) {
			Integer temp = Integer.valueOf(list.get(i));
			list.set(i, list.get(j));
			list.set(j, temp);
			i++;
			j--;
		}

		System.out.println(list);
	}

	public static void main(String[] args) {

		ArrayList<Integer> l1 = new ArrayList<Integer>();

		l1.add(1);
		l1.add(3);
		l1.add(5);
		l1.add(8);
		l1.add(2);
		l1.add(81);
		l1.add(43);
		l1.add(4);
		System.out.println("Original List");
		System.out.println(l1);
		System.out.println("Reversed List");
		reverse_ary_list(l1);
		// or
		System.out.println("Using Collection ");
		
		Collections.reverse(l1);
		System.out.println((l1));

		// Sorting
		Collections.sort(l1);
		System.out.println("Ascending Order" + l1);

		Collections.sort(l1, Collections.reverseOrder());
		System.out .println("Descending Order" + l1);

	}

}
