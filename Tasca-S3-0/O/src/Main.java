import Models.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Instruments> instruments = List.of(
                new Drums(),
                new Guitar(),
                new Piano()
        );

        instruments.forEach(Play::playInstrument);
    }
}
