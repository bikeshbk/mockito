import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CalculatorTest {

    Calculator calculator = null;

   /* @Mock
    CalculatorService calculatorService = mock(CalculatorService.class);*/

    @Mock
    CalculatorService calculatorService;
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();


    @Before
    public void setCalculator() {
        calculator = new Calculator(calculatorService);
    }

    @Test
    public void addTest(){

        when(calculatorService.add(10,10)).thenReturn(20);
        assertEquals(20, calculator.perform(10, 10));
        verify(calculatorService).add(10,10);
    }

}