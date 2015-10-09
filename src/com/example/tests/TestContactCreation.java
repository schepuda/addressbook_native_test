package com.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.framework.Contact;

public class TestContactCreation extends TestBase {
	
	
	@Test
	public void shouldCreateContactWithValidData() {
		Contact contact = new Contact().setFirstName("tester").setLastName("testerov");
		app.getContactHelper().createContact(contact);
		Contact createdContact = app.getContactHelper().getFirstContact();
		Assert.assertEquals(contact, createdContact);
	}

}
