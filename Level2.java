
public class Level2 extends GameLevel{
    void createEnemies(){
        environment = "classrooms, cafeteria, security, escalators";
        name = "Centennial Hall Level 2";
        EnemyFactory fact = new CentennialHallEnemyFactory();
        for(int i = 0; i < 6;i++){
            enemies.add(fact.createGoomba());
            enemies.add(fact.createKoopaTroopa()); 
            enemies.add(fact.createHammerBro());	
        }
    }
    public String toString(){
        return "***Completed playing " + getName() + " ***";
    }
}
