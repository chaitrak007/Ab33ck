package browsertesting;

import org.testng.annotations.Test;

public class Grouping_In_TestNg {
	

	@Test(groups= {"smoke"})
	public void testcase1() {
		System.out.println("testcase1");
	}
	@Test(groups= {"system"})
	public void testcase2() {
		System.out.println("testcase2");
	}
	
	@Test(groups= {"Integration"})
	public void testcase3() {
		System.out.println("testcase3");
	}
	@Test(groups= {"Regression"})
	public void testcase4() {
		System.out.println("testcase4");
	}
	
	@Test(groups= {"smoke","system"})
	public void testcase5() {
		System.out.println("testcase5");
	}
	@Test(groups= {"sanity","smoke"})
	public void testcase6() {
		System.out.println("testcase6");
	}
	@Test(groups= {"system"})
	public void testcase7() {
		System.out.println("testcase7");
	}
	@Test(groups= {"smoke"})
	public void testcase8() {
		System.out.println("testcase8");
	}
	@Test(groups= {"Integration"})
	public void testcase9() {
		System.out.println("testcase9");
	}
	@Test(groups= {"smoke","Regression","system"})
	public void testcase10() {
		System.out.println("testcase10");
	}
}
