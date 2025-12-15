package net.konic.corejava.KeyWordExp;

import java.util.Scanner;

public class BreakExpStopReadingStockPrices {
	// 5) BREAK – Stop Reading Stock Prices
	// Input: 120, 135, 98, -1
	// Output: Stop reading at -1



	    public static void main(String[] args) {

	        Scanner scr = new Scanner(System.in);

	        System.out.println("Enter stock prices:");

	        for (int i = 1; i <=4; i++) {   
	            int price = scr.nextInt();

	            if (price == -1) {
	                System.out.println("Stop reading at -1");
	                break;  
	            }
	            System.out.println(i);
	        }
	       scr.close();
	    }
	    
	}
