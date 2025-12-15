package net.konic.corejava.basicClass;
public class testObjectExp {
	
	public static void main(String[] args) {
		
		
		
		objectExp O = new objectExp();
		
		O.a =10;
		O.b=20;
		
		
		int sum =O.sum();
		int sub = O.sub();
		int mul = O.mul();
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		
	}

}
