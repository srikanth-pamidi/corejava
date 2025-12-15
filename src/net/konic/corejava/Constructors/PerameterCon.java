package net.konic.corejava.Constructors;

public class PerameterCon {
	int rollnum;
	String Name;
	
	public PerameterCon(int i , String name) {
		rollnum = i;
		Name = name;
	}
		public static void main(String[] args) {
			PerameterCon obj = new PerameterCon(1,"Sri");
			System.out.println(obj.Name);
			System.out.println(obj.rollnum);
			
			
		}
		
	}
	
	


