package bad_practice;

import lombok.SneakyThrows;

public class NdsResolver {
    private static final NdsResolver ourInstance = new NdsResolver();

    private NdsResolver() {
    }

    public static NdsResolver getInstance() {
        return ourInstance;
    }

    @SneakyThrows
    private double getNdsFromCentralBank() {
        Thread.sleep(2000);
        return 0.18;
    }

    public double getNds() {
        return getNdsFromCentralBank();
    }
}
