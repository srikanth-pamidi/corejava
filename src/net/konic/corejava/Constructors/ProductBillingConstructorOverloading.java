package net.konic.corejava.Constructors;

public class ProductBillingConstructorOverloading {
	
	/*
	 * 4.Product Billing(ConstructorOverloading)
	 * 
	 * Input: 
	 * • Product 1 → name="Phone", price=20000 
	 * • Product 2 → default constructor (no input)
	 * 
	 * Output: Product: Phone, Price: 20000 Product: Unknown, Price: 0
	 * 
	 * ✳ Task:
	 * 
	 * Create 2 constructors: no-arg + parameterized
	 * 
	 * Display product details
	 */
	
	String name;
	int price;
	
	public ProductBillingConstructorOverloading(String n,int p) {
		name= n;
		price = p;
		
	}
	public ProductBillingConstructorOverloading() {
		name = "Unknown";
		price = 0;
		
	}
	
	public static void main(String[] args) {
		ProductBillingConstructorOverloading obj = new ProductBillingConstructorOverloading("Phone",20000);
		ProductBillingConstructorOverloading obj2 = new ProductBillingConstructorOverloading();
		
		System.out.println("Product Name : "+obj.name);
		System.out.println("Price : "+obj.price);
		System.out.println("Product Name : "+obj2.name);
		System.out.println("Price : "+obj2.price);
	}
	

}
