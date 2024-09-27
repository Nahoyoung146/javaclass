package Person;

public class main {
	public static void main(String[] args) {
		Student student = new Student("철수",100);
		Player player1= new Player("영희");
		Player player2= new Player("민수");
		
//		player1.play(student);
//		
//		System.out.println();
		
		player1.play(player2);
	}
}