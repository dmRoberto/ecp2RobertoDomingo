package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserTest {

	@Test
	public void initialsTest() {
		User testUser = new User(111, "Name", "FamilyName");
		assertEquals("N.", testUser.initials());
	}

	@Test
	public void fullNameTest() {
		User testUser = new User(111, "Name", "FamilyName");
		assertEquals("Name Familyname", testUser.fullName());
	}

	@Test
	public void getUppercaseNameTest() {
		User testUser = new User(111, "Name", "FamilyName");
		assertEquals("NAME", testUser.getUppercaseName());
	}
	
}
