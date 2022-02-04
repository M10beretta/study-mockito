import lombok.SneakyThrows;

public class RussianNdsResolver implements NdsResolver {
    private final Double nds;

    public RussianNdsResolver() {
        nds = getNdsFromCentralBank();
    }

    @SneakyThrows
    private double getNdsFromCentralBank() {
        Thread.sleep(2000);
        return 0.18;
    }

    @Override
    public double getNds() {
        return nds;
    }
}
