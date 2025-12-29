package net.konic.corejava.HashMap_LinkedHashMap;

import java.util.Objects;

public class Employee {
	
	int id;
	String name;
	String dep;
	
	public Employee(int id, String name,String dep) {
	
		this.id = id;
		this.name = name;
		this.dep=dep;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dep=" + dep + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dep, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(dep, other.dep) && id == other.id && Objects.equals(name, other.name);
	}
	
	

}
