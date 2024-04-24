package character;

public abstract class Character {
	protected int health;
	protected int level;
	protected int noHealthPots;
	
	
	public Character(int health, int level, int noHealthPots) {
		super();
		this.health = health;
		this.level = level;
		this.noHealthPots = noHealthPots;
	}
	
	public Character(Character copy) {
		this.health = copy.health;
		this.level = copy.level;
		this.noHealthPots = copy.noHealthPots;
	}
	
	boolean Attack() {
		return true;
	}
	
	boolean usePotion() {
		return true;
	}
	
	//prints the users current health
	boolean checkHealth () {
		return true;
	}
	
	//print operations to gives info on stats
	boolean checkStats () {
		return true;
	}
	
	boolean levelUp () {
		this.health = this.health + 1;
		return true;
	}

	public int calculateHealth() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int startingPots() {
		// TODO Auto-generated method stub
		return 0;
	}
}
