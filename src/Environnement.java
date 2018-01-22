/**
 * Created by Malomek on 21/01/2018.
 */

import java.util.concurrent.ThreadLocalRandom;

public class Environnement implements Runnable{
    // if state = 0 then DANGER
    // if state = 1 then OK
    private int state;

    public int GetState(){
        return state;
    }

    public Environnement(int state){
        this.state = state;
    }


    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
            // Randomizing next State
            // 80% chance of OK
            // 20% chance of DANGER
            if (ThreadLocalRandom.current().nextInt(1, 10 + 1) <= 2) {
                state = 0;
            } else {
                state = 1;
            }
        }
    }
}
