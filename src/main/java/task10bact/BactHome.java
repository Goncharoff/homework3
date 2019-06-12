package task10bact;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BactHome {
    private List<Bacterium> aliveBacteriums = new ArrayList<>();
    public static final int MAXIMUM_NUMBER_OF_BACTERIUMS = 10;
    private static final String[] types = {"Type1", "Type2", "Type3"};
    int randomIndex = new Random().nextInt(types.length);
    int randomLifeTime = new Random().nextInt(1000);

    public BactHome() {
        for (int i = 0; i < MAXIMUM_NUMBER_OF_BACTERIUMS; ++i) {
            String reallyOriginalName = "Name  " + i;
            aliveBacteriums.add(new Bacterium(types[randomIndex], reallyOriginalName, randomLifeTime));
        }
    }

    public Bacterium getBacterium() {
        for (Bacterium bacterium : aliveBacteriums) {
            bacterium.setBacteriumProperties(types[randomIndex], randomLifeTime);

            return bacterium;
        }

        return null;
    }
}
