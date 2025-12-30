
package net.konic.corejava.HashMap_LinkedHashMap;

import java.util.*;

public class LinkedHashMapDemo {
	
	int id;
	String course;
	
	public LinkedHashMapDemo(int id, String course) {
		this.id = id;
		this.course = course;
	}

	@Override
	public String toString() {
		return "LinkedHashMapDemo [id=" + id + ", course=" + course + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(course, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinkedHashMapDemo other = (LinkedHashMapDemo) obj;
		return Objects.equals(course, other.course) && id == other.id;
	}
	
	
	public static void main(String[] args) {
		
		Map<Integer,LinkedHashMapDemo> map = new LinkedHashMap();
		map.put(1,new LinkedHashMapDemo(1,"Java"));
		map.put(3,new LinkedHashMapDemo(3,"C++"));
		map.put(1,new LinkedHashMapDemo(1,"Advanced Java"));
		map.put(2,new LinkedHashMapDemo(2,"Python"));
		System.out.println(map);
		System.out.println(map.get(1));
        for(Integer id : map.keySet()) {
        	System.out.println(id);
        }
        for(LinkedHashMapDemo value : map.values()) {
        	System.out.println(value);
        }
        map.remove(1);
        System.out.println(map);
        System.out.println(map.size());
        
		
		
		
		
	}
	
	

}
