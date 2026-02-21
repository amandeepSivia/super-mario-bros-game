
public class DuckworthCentre extends GameWorld {
    public GameLevel createLevel(int level){
        if(level == 1){
            return new Level1();
        }
        else if(level == 2){
            return new Level2();
        }
        else if(level == 3){
            return new Level3();
        }
        else{
            return null;
        }
    }
}
