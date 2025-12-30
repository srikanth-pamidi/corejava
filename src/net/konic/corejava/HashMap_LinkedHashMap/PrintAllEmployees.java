package net.konic.corejava.HashMap_LinkedHashMap;
import java.util.*;
public class PrintAllEmployees {
	
	public static void main(String[] args) {
		Map<Integer,EmplyeeLinkedHashMap> map = new LinkedHashMap<>();
		map.put(101, new EmplyeeLinkedHashMap (101,"Ayaan"));
		map.put(102, new EmplyeeLinkedHashMap (102,"Rahim"));
		map.put(103, new EmplyeeLinkedHashMap (103,"Sara"));
		for( Map.Entry<Integer,EmplyeeLinkedHashMap> details :map.entrySet()) {
			System.out.println(details.getKey()+"-->"+details.getValue());
		}
	}

}
