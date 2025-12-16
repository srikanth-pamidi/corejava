package net.konic.corejava.Encapsulation;

public class MobilePinSecurity {
/*	Q4. MobilePinSecurity
	Question:
	Create a Mobile class with private pin.
	PIN must be exactly 4 digits.
	Input:
	Enter PIN: 123
	Output:
	Invalid PIN
*/

private int pin;

public int getPin() {
	return pin;
}

public void setPin(int pin) {
	if (pin > 999 && pin < 10000) {
		this.pin = pin;
	} else {
		System.out.println("Invalid Pin");
	}
}

public static void main(String[] args) {
	MobilePinSecurity obj = new MobilePinSecurity();
	obj.setPin(123);

	int pin = obj.getPin();
	

}
}
