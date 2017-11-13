package advance;

import java.util.ArrayList;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[5]; // fixed array we need unlimited
		// ArrayList<Integer> values = new ArrayList<Integer>();
		List<Integer> values = new ArrayList<Integer>(); // for sorting
		// ArrayList values = new ArrayList();
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(0, 1);

		for (int i : values) {
			// System.out.println("all :"+""+i);
		}
	}

}
