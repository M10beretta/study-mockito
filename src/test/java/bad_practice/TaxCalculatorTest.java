package bad_practice;

import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.AdditionalAnswers.answer;
import static org.mockito.Mockito.*;

class TaxCalculatorTest {

    @Test
    void withNdsTest() {
        NdsResolver mockNdsResolver = mock(NdsResolver.class);
        when(mockNdsResolver.getNds()).thenReturn(0.2);

        // переопределили логику работы метода, вставив в него mockNdsResolver
        TaxCalculator mockTaxCalculator = mock(TaxCalculator.class);
        when(mockTaxCalculator.withNds(anyDouble())).then(answer((Answer1<Double, Double>)
                prise -> mockNdsResolver.getNds() * prise + prise));

        assertEquals(120.0, mockTaxCalculator.withNds(100), 0.00001);
    }
}