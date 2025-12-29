package net.konic.corejava.HashMap_LinkedHashMap;

import java.util.Objects;

public class Employees {
	
	private int id;
	private String name;
	private String dept;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dept, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		return Objects.equals(dept, other.dept) && id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
	

}
