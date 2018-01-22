import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by Malomek on 21/01/2018.
 */
public class Agent implements Runnable{

    public Set objectifs;  //Le but de la vie de notre agent est d'accomplir au moins une fois chacun des objectifs que nous avons créé


    public Agent(){
        this.objectifs = new HashSet();
        this.objectifs.add(1);
        this.objectifs.add(2);
        this.objectifs.add(3);

    }

    public void agit(int n) throws InterruptedException {//ici en fonction du numéro d'objectif donné l'agent va accomplir la tache correspondante
        switch(n){
            case 1 : Thread.sleep(1000);
            break;
            case 2 : Thread.sleep(2000);
            break;
            case 3 : Thread.sleep(3000);
            break;
        }
        System.out.println("Objectif " + n + " accompli");
    }


    public void run(){

        Agent agent = new Agent();

        while(!agent.objectifs.isEmpty()){        //La boucle fera travailler l'agent jusqu'à ce que sa liste d'objectifs à faire soit vide

            Random rand = new Random();
            int  n = rand.nextInt(3) + 1;

            try {
                agent.agit(n);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            agent.objectifs.remove(n);    //ici l'agent retire le numéro d'objectif de sa liste à faire (s'il n'est pas déjà enlevé)

        }

        System.out.println("fini !");

    }

}
