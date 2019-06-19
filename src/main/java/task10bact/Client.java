package task10bact;

import java.util.Timer;
import java.util.TimerTask;

public class Client {

    public static void main(String[] args) {
        BactHome bactHome = new BactHome();

        for (int i = 0; i < 35; i++) {
            Bacterium bacterium = bactHome.getBacterium();
            if (bacterium != null) {
                System.out.println("Bact " + i);
                bacterium.addBactToHome();
            } else {
                waitSomeTime();
            }
        }


    }

    public static void waitSomeTime() {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                // Your database code here
            }
        },  1000);
    }
}
