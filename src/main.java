/**
 * Created by Malomek on 21/01/2018.
 */
public class main {

    public static void main (String[] args){
        // Create Environnement and Start it
        Thread env = new Thread(new Environnement(1));
        env.start();
    }
}
