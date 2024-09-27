
public class Player {
	int dice;
	String name;

	Player(){
		dice=0;
		name="알 수 없음";
	}
	
	Player(String name){
		dice=0;
		this.name=name;
	}
	
	String play(Player player,Player player2) {
		this.dice=rollDice();
		player.dice=rollDice();
		player2.dice=rollDice();
		
		String winner;
		
		if((this.dice > player.dice) && (this.dice > player2.dice)) {
			winner=this.name;
		}
		else if((player.dice > this.dice) && (player.dice > player2.dice)) {
			winner=player.name;
		}
		else if((player2.dice > this.dice) && (player2.dice > player.dice)) {
			winner=player2.name;
		}
		else {
			winner="무승부";
		}
		
		return winner;
	}

	int rollDice() {
		return (int) (Math.random()*6+1);
	}
}