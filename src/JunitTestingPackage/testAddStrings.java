package JunitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testAddStrings {

	@Test
	public void test() {
		JunitFunction junitString=new JunitFunction();
		String result=junitString.addString("software", "engineering");
		assertEquals("softwareengineering",result);
	}

}
