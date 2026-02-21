
public abstract class GameWorld {
    abstract GameLevel createLevel(int l);
    public GameLevel playLevel(int level){
        GameLevel gameLevel = createLevel(level);
        gameLevel.createEnemies();
        System.out.println("***Setting up " + gameLevel.getName() + " *** ");
        gameLevel.renderEnvironment();
        gameLevel.renderEnemies();
        gameLevel.spawnEnemies();
        //System.out.println("***Completed playing  " + gameLevel.getName() + " *** ");
        return gameLevel;
    }
}
