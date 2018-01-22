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
        // Environment is always active
        while (true) {
            try {
                // Possible change of state every 0.5seconds
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
            // Randomizing next State
            // 90% chance of OK
            // 10% chance of DANGER
            if (ThreadLocalRandom.current().nextInt(1, 10 + 1) <= 1) {
                state = 0;
            } else {
                state = 1;
            }
        }
    }
}
