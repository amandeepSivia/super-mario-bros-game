import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Level3 extends GameLevel{
    void createEnemies(){
        environment = "labs, atrium, study spaces, rooftop garden";
        name = "Richardson College Level 3";
        EnemyFactory ref = new RichardsonCollegeEnemyFactory();
        List<Enemy> temp=new ArrayList<>();
        for(int i = 0; i < 7;i++){
            temp.add(ref.createGoomba());
            temp.add(ref.createKoopaTroopa()); 
            temp.add(ref.createHammerBro());	
        }

        Random rand = new Random();
        while(temp.size()!=0){
            int r = rand.nextInt(temp.size());
            Enemy tempE = temp.remove(r);
            enemies.add(tempE);
        }
    }
    public String toString(){
        return "***Completed playing " + getName() + " ***";
    }
}
