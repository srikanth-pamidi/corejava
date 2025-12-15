package net.konic.corejava.Constructors;

import java.security.DomainCombiner;

public class MobileRechargeStaticUtilityMethod {
	/*
	 * 9.MobileRechargeStaticUtilityMethod
	 * 
	 * Input: amount=199 → recharge plan
	 *  Output:
	 *  Recharge Successful: 1.5GB/day, 28
	 * days
	 * 
	 * ✳ Task:
	 * 
	 * Use static method getPlan(amount)
	 * 
	 * Constructor sets mobileNumber
	 */
	
	String mobilenum;
	
	public MobileRechargeStaticUtilityMethod(String n) {
		mobilenum = n;
		
	}
	
	public static String getPlan (int amount) {
		 if (amount == 199) {
            return "1.5GB/day, 28 days";
		
	}else {
		return "Invalid Plan";
	}
	}
	public static void main(String[] args) {
		MobileRechargeStaticUtilityMethod obj = new MobileRechargeStaticUtilityMethod("7730000103");
		obj.getPlan(199);
		System.out.println("Enter Mobile Number : "+obj.mobilenum);
		System.out.println("Enter Plan : "+obj.getPlan(199));
		
		
	}
	

}
