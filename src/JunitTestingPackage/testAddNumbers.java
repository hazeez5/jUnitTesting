package JunitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testAddNumbers {

	@Test
	public void test() {
		JunitFunction junit=new JunitFunction();
		int result=junit.addNumbers(101, 200);
		assertEquals(300,result);
		
		
		
	}

}
