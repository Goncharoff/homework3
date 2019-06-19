package task10bact;

import java.util.Timer;
import java.util.TimerTask;

public class Bacterium {
    String type;
    String name;
    int lifeTimeDuration;
    boolean isAlive = true;

    public Bacterium(String type, String name, int lifeTimeDuration) {
        this.type = type;
        this.name = name;
        this.lifeTimeDuration = lifeTimeDuration;
    }


    private void startLifeTime() {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                isAlive = false;
            }
        }, lifeTimeDuration * 1000);

        isAlive = true;
    }

    public void setBacteriumProperties(String type, int lifeTimeDuration){
        this.type = type;
        this.lifeTimeDuration = lifeTimeDuration;
    }

    public void addBactToHome(){
        System.out.println("Name " + name + " type " + type + " will live " + lifeTimeDuration);
        startLifeTime();
    }
}
