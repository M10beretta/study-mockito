package bad_practice;


public class TaxCalculator {

    /**
     * минус реализации с синглтоном в том,
     * что в тестах придется переопределять этот метод в mockTaxCalculator чтобы вставить mockNdsResolver
     * который будет возвращать нужное значение независимо от значения NdsResolver
     */
    public double withNds(double price) {
        return NdsResolver.getInstance().getNds() * price + price;
    }
}
