package tn_junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MeasurementTest {

	@Test
	void testAdd() {
		Measurement m=new Measurement(5);
		m.add(m);
		assertEquals(10,m.getValue());
	}

	@Test
	void testSub() {
		/*
		 * Measurement m=new Measurement(10); m.sub(m); assertEquals(10,m.getValue());
		 */
	}

}
