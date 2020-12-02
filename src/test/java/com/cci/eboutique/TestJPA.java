package com.cci.eboutique;

import static org.junit.Assert.*;
import org.junit.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestJPA {

	@Test
	public void test() {
	try {
	ClassPathXmlApplicationContext app=
	new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
	assertTrue(true);
	} catch (Exception e) {
	assertTrue(e.getMessage(),false);
	}
	}

}




