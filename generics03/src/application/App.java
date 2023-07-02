package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// List<Object> myObjs = new ArrayList<Object>(); um list<integer> n é um
		// subtipo de list<object>
		List<?> myObjs = new ArrayList<Object>(); // supertipo de qualquer tipo de lista
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers;

		// aqui sim integer é um subtipo de object
		Object obj;
		Integer x = 10;
		obj = x;

		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);

		List<String> myStrs = Arrays.asList("Maria","Alex","Bob");
		printList(myStrs);

	}

	public static void printList(List<?> list) {
		//list.add(3); da erro
		for (Object object : list) {
			System.out.println(object);
		}
	}

}
