package com.local.wf.apitestharness;

import java.util.Scanner;

public class GetInputsAndAdd {

	static int num1, num2, num3;
	Scanner scan = new Scanner(System.in);

	public void getInput() {

		System.out.println("Enter 2 integers to add, First : ");
		while (!scan.hasNextInt()) {
			System.out.print("Input is not an integer! Only Integers are allowed. Please Enter a Integer only!!!");
			scan.next();
		}
		num1 = scan.nextInt();

		System.out.println("Enter 2 integers to add, Second : ");
		while (!scan.hasNextInt()) {
			System.out.print("Input is not an integer! Only Integers are allowed. Please Enter a Integer only!!!");
			scan.next();
		}
		num2 = scan.nextInt();
	}

	public void addition() {
		num3 = num1 + num2;
		// num3 = Math.addExact(num1, num2);
		System.out.println("Total of  " + num1 + "  and  " + num2 + "  is :  " + num3);
	}

}
