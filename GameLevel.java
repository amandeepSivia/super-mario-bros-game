
import java.util.ArrayList;
import java.util.List;


public abstract class GameLevel {
    String name;
    String environment;
    List<Enemy> enemies=new ArrayList<>();

    abstract void createEnemies();

    void renderEnemies(){
        System.out.println("Rendering enemies..." +environment);
    }
    void spawnEnemies(){
        System.out.println("Spawning enemies:"); 
        for(int i = 0; i < enemies.size()-1;i++){
            System.out.print(enemies.get(i)+", ");
        }
        System.out.println(enemies.get(enemies.size()-1));
    }
    void renderEnvironment(){

    }
    String getName(){
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    String getEnvironment(){
        return environment;
    }
    void setEnvironment(String environment) {
        this.environment = environment;
    }
}

