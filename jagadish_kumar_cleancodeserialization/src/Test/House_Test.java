package Test;
import static org.junit.Assert.*;

import org.junit.Test;

import Main.House_Construction.Generate_Cost;

public class House_Test {

	@Test
	public void testCost() {
		Generate_Cost testObject= new Generate_Cost();
		assertEquals(2400.00,testObject.Cost("standard", 2),0);
	}
	@Test
	public void testCost1() {
		Generate_Cost testObject= new Generate_Cost();
		assertEquals(3000.00,testObject.Cost("Abovestandard", 2),0);
	}
	@Test
	public void testCost2() {
		Generate_Cost testObject= new Generate_Cost();
		assertEquals(3600.00,testObject.Cost("Highstandard", 2),0);
	}
	@Test
	public void testCost3() {
		Generate_Cost testObject= new Generate_Cost();
		assertEquals(5000.00,testObject.Cost("HighstandardFullautomatic", 2),0);
	}

}