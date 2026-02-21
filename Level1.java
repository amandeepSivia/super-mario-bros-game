
public class Level1 extends GameLevel{
    void createEnemies(){
        environment = "classrooms, labs, fitness facility, gym";
        name = "Duckworth Centre Level 1";
        EnemyFactory fact = new DuckworthCentreEnemyFactory();
        for(int i = 0; i < 5;i++){
            enemies.add(fact.createKoopaTroopa()); 
        }
        for(int i = 0; i < 6;i++){
            enemies.add(fact.createGoomba());
            
        }
        for(int i = 0; i < 4;i++){
            enemies.add(fact.createHammerBro());	
        }
    }
    public String toString(){
        return "***Completed playing " + getName() + " ***";
    }
}

