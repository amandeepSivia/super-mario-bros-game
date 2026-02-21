
public class DuckworthCentreEnemyFactory implements EnemyFactory{
    public GoombaSpecies createGoomba(){
        return new Goomba();
    }
    
    public KoopaTroopaSpecies createKoopaTroopa(){
        return new KoopaTroopa();
    }
	
	public HammerBroSpecies createHammerBro(){
        return new HammerBro();
    }
}
