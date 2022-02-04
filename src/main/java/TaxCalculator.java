import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TaxCalculator {
    private NdsResolver ndsResolver;

    public double withNds(double price) {
        return ndsResolver.getNds() * price + price;
    }
}
