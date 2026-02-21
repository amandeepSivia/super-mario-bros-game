
public class AbstractEnemyFactoryDriver{
    public static void main(String[] args){
        EnemyFactory def = new DuckworthCentreEnemyFactory();
        System.out.println("Duckworth Centre Enemies: ");
        System.out.println(def.createGoomba());
        System.out.println(def.createKoopaTroopa()); 
        System.out.println(def.createHammerBro());		
        
        EnemyFactory cef = new CentennialHallEnemyFactory();
        System.out.println("\nCentennial Hall Enemies: ");
        System.out.println(cef.createGoomba());
        System.out.println(cef.createKoopaTroopa()); 
        System.out.println(cef.createHammerBro());	
        
        EnemyFactory ref = new RichardsonCollegeEnemyFactory();
        System.out.println("\nRichardson College Enemies: ");
        System.out.println(ref.createGoomba());
        System.out.println(ref.createKoopaTroopa()); 
        System.out.println(ref.createHammerBro());	
    }
}
