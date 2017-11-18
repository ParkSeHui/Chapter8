// 20153015 박세희
class InvalidWithdraw1 extends Exception {		//새로운 예외 구현
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw1(String msg) {
		super(msg);
	}
}

class BankAccount1 {
	int min;		//최저 잔금
	int total=0;		// 통장 잔고
	
	public BankAccount1(int min) {	// 최저 잔금 저장
		this.min = min;
	}
	
	public void deposit(int money){		// 입금 메소드
		total += money;
		System.out.println(money  +  "원 입금하여 현재 잔고는  "  + total + "원 입니다.");
	}
	
	public void withdraw1(int money) {		// 출금 메소드
		if(min > (total-money) || money <= 0) {		// 출금할 금액이 최저 잔금보다 이하이거나 출금할 금액이 음수인 경우 예외 발생
			InvalidWithdraw1 i = new InvalidWithdraw1("출금할 수 없습니다.");
			System.out.println(i);
		}	
		else{
			total -= money;
			System.out.println(money + "원 출금하여 현재 잔고는  " + total + "원 입니다." );
		}	
	}
}

public class Ex02 {

	public static void main(String[] args) {
		BankAccount1 ba = new BankAccount1(-100000);		// 최저 잔금 저장
		ba.withdraw1(500000);		// 출금 금액
	}

}
