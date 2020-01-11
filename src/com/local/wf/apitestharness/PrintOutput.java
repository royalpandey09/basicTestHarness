package com.local.wf.apitestharness;

public class PrintOutput extends GetInputsAndAdd {

	static GetInputsAndAdd sumofnumbers = new GetInputsAndAdd();

	public static void main(String[] args) {
		sumofnumbers.getInput();
		sumofnumbers.addition();
	}

}
