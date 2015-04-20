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

	@Test
	public void testIIIplusIIIequalsVI(){
		assertEquals(romertal.calculate("III", "III"), "VI");
	}
	
	@Test
	public void testVplusVIequalsXI(){
		assertEquals(romertal.calculate("V", "VI"), "XI");
	}
	
	@Test
	public void testXXXplusXXXequalsLX(){
		assertEquals(romertal.calculate("XXX", "XXX"), "LX");
	}
	
	@Test
	public void testLXplusXXXXXequalsCX(){
		assertEquals(romertal.calculate("LX", "XXXXX"), "CX");
	}
	
	@Test 
	public void testCCCLXXXXVIIIIplusCCLXXXVIIIequalsDCLXXXVII(){	
		assertEquals(romertal.calculate("CCCLXXXXVIIII", "CCLXXXVIII"), "DCLXXXVII");
	}
	
	@Test 
	public void testDCLXVIIplusDCLXXXVIIIequalsMCCCLV(){	
		assertEquals(romertal.calculate("DCLXVII", "DCLXXXVIII"), "MCCCLV");
	}
}
