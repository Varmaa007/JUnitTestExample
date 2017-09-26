package JUnitTestExamplePackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		JUnitFunction JUnitString= new JUnitFunction();
		String result = JUnitString.addstrings("Lab","Assignment");
		assertEquals("LabAssignment",result);
	}

}
