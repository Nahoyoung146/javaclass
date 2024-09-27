
public class Accountnumber {
	private String accountnumber;
	private int balance;
	int money;
	
	public Accountnumber() {
		this.accountnumber="123-456-789";
		this.balance = 3000;
	}
	
	String getAccountnumber() {
		return accountnumber;
	}
	
	void setBalance(int balance) {
		this.balance = balance;
	}
	
	void printBalance() {
		System.out.println("잔액이 " + balance + "원입니다.");
	}
	
	protected void deposit(int money) {
		if(money<=0) {
			System.out.println("입금불가한 금액입니다.");
		}
		
		else {
			System.out.println("계좌에서 " + money + "원이 입금되었습니다");
			setBalance(balance + money);
			printBalance();
		}
	}

	protected void withdraw(int money) {
		if(money>balance) {
			System.out.println("잔액이 부족합니다.");
		}
		
		else {
			System.out.println("계좌에서 " + money + "원이 출금되었습니다");
			setBalance(balance-money);
			printBalance();
		}
	}
}

// RPG 게임
//유닛 - (캐릭터, 몬스터) - (직업)
//유닛 - 공격력, 체력, 레벨
//몬스터 - 타입
//캐릭터 - 경험치
//직업 - 지업이름, 스킬