package net.konic.corejava.HashMap_LinkedHashMap;
import java.util.*;

public class CheckEmployeeExists {
	public static void main(String[] args) {
		Map<Integer,EmplyeeLinkedHashMap> map = new LinkedHashMap<>();
		map.put(101, new EmplyeeLinkedHashMap (101,"Ayaan"));
		map.put(102, new EmplyeeLinkedHashMap (102,"Rahim"));
		map.put(103, new EmplyeeLinkedHashMap (103,"Sara"));
		if(map.containsKey(104)) {
			System.out.println("Employee  Found");
		}else {
			System.out.println("Employee not Found");
		}
		
	}

}
