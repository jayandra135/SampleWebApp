package tn_junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testFact() {
		Calculator cc=new Calculator();
		assertEquals(120, (cc.fact(5)));
	}

}
