package net.konic.corejava.Encapsulation;
/* Q5. ProductPriceControl
Question:
Create a Product class with private price.
Price cannot be negative.
Input:
Enter Price: -500
Output:
Invalid price 
*/

public class ProductPriceControl {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price >= 0) {
			this.price = price;
		} else {
			System.out.println("Invalid Price.");
		}

	}

	public static void main(String[] args) {
		ProductPriceControl obj = new ProductPriceControl();
		obj.setPrice(-500);
		int price = obj.getPrice();

	}

}
