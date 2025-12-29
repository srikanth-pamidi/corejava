package net.konic.corejava.map;
import java.util.*;

public class GetTotalEmployeeCount {
	
	public static void main(String[] args) {
		Map<Integer,EmplyeeLinkedHashMap> map = new LinkedHashMap<>();
		map.put(101, new EmplyeeLinkedHashMap (101,"Ayaan"));
		map.put(102, new EmplyeeLinkedHashMap (102,"Rahim"));
		map.put(103, new EmplyeeLinkedHashMap (103,"Sara"));
		
		System.out.println("Size : "+ map.size());
		
		
	}

}
