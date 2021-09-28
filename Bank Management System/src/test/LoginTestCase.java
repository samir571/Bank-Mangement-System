package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoginTestCase {
	@Test
	void test() {
		String id = "samir";
		String pw = "sam123";
		LoginMain l = new LoginMain();
		boolean result = l.checklogin(id,pw);
		assertEquals(true,result);
	}

}
