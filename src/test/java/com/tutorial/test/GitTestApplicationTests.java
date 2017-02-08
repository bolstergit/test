package com.tutorial.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GitTestApplicationTests {

	@Test
	public void defaultState() {
		GitTestApplication app = new GitTestApplication();
		assertTrue(app.isEnabled());
	}
	
	@Test
	public void updateEnabledState(){
		GitTestApplication app = new GitTestApplication();
		app.setEnabled(false);
		assertFalse(app.isEnabled());
		app.setEnabled(true);
		assertTrue(app.isEnabled());
	}

}
