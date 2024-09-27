
public class main {
	public static void main(String[] args) {
		Player player1 = new Player("철수");
		Player player2 = new Player("영희");
		Player player3 = new Player("민수");
		
		String winner=player1.play(player2,player3);
		
		while(winner.equals("무승부")) {
			System.out.println("무승부입니다. 재경기입니다.");
			winner=player1.play(player2,player3);
		}
		
		System.out.println("최종 승자는 " + winner + "입니다.");
	}
}