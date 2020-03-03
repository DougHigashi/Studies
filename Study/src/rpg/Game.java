package rpg;

public class Game {
	
	public static void main(String[] args) {
		Player player1 = new Player("Jake", ID.Player);
		
		
		System.out.println(player1.getName());
		System.out.println("Strength:" + player1.getStrength());
		StatsUp.LvlUp(player1, 5);
		System.out.println("Strength:" + player1.getStrength());
	}
	
	
	
	
	

}
