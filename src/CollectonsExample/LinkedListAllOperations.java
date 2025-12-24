package CollectonsExample;

import java.util.*;

public class LinkedListAllOperations {
	List<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		LinkedListAllOperations listAllOperations = new LinkedListAllOperations();
		List<Integer> output = listAllOperations.addData();
		System.out.println("Data " + output);

	}

	private List<Integer> addData() {

		list.add(2);
		list.add(3);
		return list;

	}
}
