
public class SuperMarioUWDriver{
    public static void main(String[] args){
        GameWorld duckworth = new DuckworthCentre();
        GameWorld centennial = new CentennialHall();
        GameWorld richardson = new RichardsonCollege();
        GameLevel level = duckworth.playLevel(1);
        System.out.println(level + "\n");
        level = centennial.playLevel(2);
        System.out.println(level + "\n");
        level = richardson.playLevel(3);
        System.out.println(level + "\n");
    }
}
