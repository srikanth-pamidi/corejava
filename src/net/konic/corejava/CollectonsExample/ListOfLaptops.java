package net.konic.corejava.CollectonsExample;

import java.util.*;

public class ListOfLaptops {

	Set<Laptop> addLaptopDetails() {

		Laptop obj = new Laptop();
		obj.setBrandName("HP");
		obj.setBrandName(null);
		obj.setBrandName(null);
		obj.setBrandName("HP");
		obj.setPrice(20000);

		Laptop obj1 = new Laptop();
		obj1.setBrandName("DELL");
		obj1.setPrice(30000);

		Laptop obj2 = new Laptop();
		obj2.setBrandName("Apple");
		obj2.setPrice(90000);

		Set set = new LinkedHashSet();
		set.add(obj);
		set.add(obj1);
		set.add(obj2);

		return set;

	}

	public static void main(String[] args) {

		ListOfLaptops lp = new ListOfLaptops();
		lp.addLaptopDetails();
		System.out.println("List Of Laptop Details : " + lp.addLaptopDetails());
	}

}
