package test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import src.Romertal;

public class TestCases {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	Romertal romertal = new Romertal();
	
	@Test
	public void testIplusIIequalsIII() {
		assertEquals(romertal.calculate("I", "II"), "III");
	}

}
