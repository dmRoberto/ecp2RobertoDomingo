package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DecimalCollectionTest {

	@Test
	public void sumTest() {
		double value1 = 10.0;
		double value2 = 15.0;

		DecimalCollection decimalCollection = new DecimalCollection();
		decimalCollection.add(value1);
		decimalCollection.add(value2);

		assertEquals(25.0, decimalCollection.sum(), 10e-5);
	}
		
	@Test
	public void higherTest() {
		double value1 = 10.0;
		double value2 = 15.0;

		DecimalCollection decimalCollection = new DecimalCollection();
		decimalCollection.add(value1);
		decimalCollection.add(value2);

		assertEquals(15.0, decimalCollection.higher(), 10e-5);
	}
	
	@Test
	public void size() {
		double value1 = 10.0;
		double value2 = 15.0;
		double value3 = 20.0;
		DecimalCollection decimalCollection = new DecimalCollection();
		decimalCollection.add(value1);
		decimalCollection.add(value2);
		decimalCollection.add(value3);
		assertEquals(3,decimalCollection.size());		
	}

}
