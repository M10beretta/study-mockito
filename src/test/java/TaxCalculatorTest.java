import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorTest {

    @Test
    void withNds() {
        NdsResolver mock = Mockito.mock(NdsResolver.class);
        Mockito.when(mock.getNds()).thenReturn(0.2);
        assertEquals(120.0, new TaxCalculator(mock).withNds(100), 0.00001);
    }
}