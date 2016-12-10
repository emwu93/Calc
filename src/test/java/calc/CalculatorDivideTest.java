package calc;

import static org.junit.Assert.assertSame;

import org.junit.Test;

import main.Calculator;

public class CalculatorDivideTest {

	Calculator calc=new Calculator();
		
	@Test
	public void test(){		
		assertSame(3,calc.divide(9,3));		
	}
	
}
