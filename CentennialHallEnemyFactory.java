
public class CentennialHallEnemyFactory implements EnemyFactory{
    public GoombaSpecies createGoomba(){
        return new Gloomba();
    }
    
    public KoopaTroopaSpecies createKoopaTroopa(){
        return new Paratroopa();
    }
	
	public HammerBroSpecies createHammerBro(){
        return new FireBro();
    }
}
