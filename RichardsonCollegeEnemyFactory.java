
public class RichardsonCollegeEnemyFactory implements EnemyFactory{
    public GoombaSpecies createGoomba(){
        return new SpikyGoomba();
    }
    
    public KoopaTroopaSpecies createKoopaTroopa(){
        return new SuperKoopa();
    }
	
	public HammerBroSpecies createHammerBro(){
        return new SledgeBro();
    }
}