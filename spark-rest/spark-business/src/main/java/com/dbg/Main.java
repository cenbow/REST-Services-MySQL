package com.dbg;

import com.dbg.controller.test.TestController;

public class Main {

	private static TestController testController;

	public static void main(String[] args) {
		init();
	}

	private static void init() {
		setTestController(new TestController());
	}

	public static TestController getTestController() {
		return testController;
	}

	public static void setTestController(TestController testController) {
		Main.testController = testController;
	}

}
