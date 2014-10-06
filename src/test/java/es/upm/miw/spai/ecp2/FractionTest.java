package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
	
	private Fraction fraction;

	@Before
	public void before(){
		fraction = new Fraction(5,10);
	}
	
	@Test
	public void decimalTest() {
		assertEquals(0.50000001, fraction.decimal(), 10e-5);
	}
	
	@Test
	public void isPropiaTest(){
		assertEquals(true, fraction.isPropia());
	}
	
	@Test
	public void isEquivalenteTest(){
		assertEquals(false, fraction.isEquivalente(new Fraction(2,3)));
	}
	
	@Test
	public void multiplicarPorTest(){
		Fraction resultado = fraction.multiplicarPor(new Fraction(2,3));
		assertEquals(new Fraction(10,30), resultado);
	}
	
	
	
}
