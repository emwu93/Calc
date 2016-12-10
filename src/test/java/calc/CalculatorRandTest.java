package calc;

import org.junit.Test;

import main.Calculator;

public class CalculatorRandTest {
	
	Calculator calc=new Calculator();
	
	
	@Test
	public void test(){			
		assertNotNull(calc.random());		
	}

}
