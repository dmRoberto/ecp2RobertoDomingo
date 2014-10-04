package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FractionTest {

	@Test
	public void decimalTest() {
		Fraction fraction = new Fraction(5, 10);
		assertEquals(0.50000001, fraction.decimal(), 10e-5);
	}
}
