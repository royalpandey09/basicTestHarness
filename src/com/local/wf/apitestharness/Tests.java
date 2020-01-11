package com.local.wf.apitestharness;

import static org.junit.Assert.*;

import org.junit.*;

public class Tests extends PrintOutput {
	int expectedOutput;

	@Test
	public void test1() {
		assertNotNull(num1);
		assertNotNull(num2);

		if (num3 != (num1 + num2)) {
			System.out.println("Total is not correct. Please Check.");
		}
	}

}
