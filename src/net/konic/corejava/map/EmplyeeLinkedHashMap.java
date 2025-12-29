package net.konic.corejava.map;

import java.util.Objects;

public class EmplyeeLinkedHashMap {
	
	 int id;
	 String name;
	 
	 public EmplyeeLinkedHashMap(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	 }
	 @Override
	 public String toString() {
		return "UpdateEmployeeName [id=" + id + ", name=" + name + "]";
	 }
	 @Override
	 public int hashCode() {
		return Objects.hash(id, name);
	 }
	 @Override
	 public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmplyeeLinkedHashMap other = (EmplyeeLinkedHashMap) obj;
		return id == other.id && Objects.equals(name, other.name);
	 }
	

}
