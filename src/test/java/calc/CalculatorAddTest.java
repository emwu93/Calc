package calc;

import static org.junit.Assert.*;

import org.junit.Test;
import main.Calculator;

public class CalculatorAddTest {
	
Calculator calc=new Calculator();
		
	@Test
	public void test(){		
		assertSame(3,calc.add(1,2));		
	}

}
