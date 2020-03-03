package rpg;

public class Player {
	
	private String name;
	private int hp, strength, speed, defense, upgrade_points, level;

	public Player(String name, ID id) {
		this.name = name;
		this.hp = 10;
		this.strength = 10;
		this.speed = 6;
		this.defense = 8;
		this.upgrade_points = 0;
		this.level = 1;
	}
	public int getStrength() {
		return strength;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getDefense() {
		return defense;
	}
	
	public int getUpPoints() {
		return upgrade_points;
	}
	
	public int getHp() {
		return hp;
	}
	public int getLevel() {
		return level;
	}
	 
	public String getName() {
		return name;
	}
	public void setStrength(int x) {
		strength+=x;
	}
	public void setHp(int x) {
		hp+=x;
	}
	public void setSpeed(int x) {
		speed+=x;
	}
	public void setDefense(int x) {
		defense+=x;
	}
	public void setUpPoints(int x) {
		upgrade_points+=x;
	}
	

}
