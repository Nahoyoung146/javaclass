
public class main {
	public static void main(String[] args) {
		Player player1 = new Player("플레이어1");
		Player player2 = new Player("플레이어2");
		Player player3 = new Player("플레이어3");
	
		player1.play(player2);
	
		player1.playOn3(player2,player3);
	}
}

class Player{
	private String name;
	private int dice;
	private String winner;
	
	Player(){
		this.name="알 수 없음";
		this.dice=6;
	}
	
	Player(String name){
		this.name=name;
		this.dice=6;
	}
	
	int rolldice() {
		int dice=(int)(Math.random()*6)+1;
		return dice;
	}
	
	void play(Player player) {
		this.dice=rolldice();
		player.dice=rolldice();
		
		if(this.dice > player.dice) {
			winner=this.name;
			System.out.println("승자는 " + winner + "입니다.");
		}
		
		else if(player.dice > this.dice) {
			winner=player.name;
			System.out.println("승자는 " + winner + "입니다.");
		}
		
		else {
			System.out.println("무승부입니다. 경기를 다시 시작해 주세요.");
		}
	}
	
	void playOn3(Player player, Player player2) {
		this.dice=rolldice();
		player.dice=rolldice();
		player2.dice=rolldice();
		
		if(this.dice > player.dice && this.dice > player2.dice) {
			winner=this.name;
			System.out.println("승자는 " + winner + "입니다.");
		}
		
		else if(player.dice > this.dice && player.dice > player2.dice) {
			winner=player.name;
			System.out.println("승자는 " + winner + "입니다.");
		}
		
		else if(player2.dice > this.dice && player2.dice > player.dice) {
			winner=player2.name;
			System.out.println("승자는 " + winner + "입니다.");
		}
		
		else {
			System.out.println("무승부입니다. 경기를 다시 시작해 주세요.");
		}
	}
}