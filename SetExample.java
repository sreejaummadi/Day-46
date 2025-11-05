package com.codegnan.collections;

import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		TreeSet<String> names=new TreeSet<String>(new MyComparator());
		names.add("Sreeja");
		names.add("siri");
		names.add("Keerthi");
		names.add("Ramu");
		names.add("Raju");
		System.out.println(names);
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(10);
		System.out.println(t);

	}

}
