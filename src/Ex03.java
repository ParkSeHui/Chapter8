// 20153015 박세희
class InvalidWithdraw extends Exception {		//새로운 예외 구현
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg) {
		super(msg);
	}
}

class BankAccount {
	int min;		//최저 잔금
	int total=0;		// 통장 잔고
	
	public BankAccount(int min) {	// 최저 잔금 저장
		this.min = min;
	}
	
	public void deposit(int money){		// 입금 메소드
		total += money;
		System.out.println("정상 입금처리 : 입금금액 = " + money + ", 잔금 = "  + total);
	}
	
	public void withdraw(int money) throws InvalidWithdraw {		// 출금 메소드
		if(min > (total-money) || money <= 0) {		// 출금할 금액이 최저 잔금보다 이하이거나 출금할 금액이 음수인 경우 예외 발생
			throw new InvalidWithdraw("초과출금 요구 예외");		//예외 발생
		}	
		else{
			total -= money;
			System.out.println("정상 출금처리 : 인출금액 = " + money + ", 잔금 = " + total );
		}	
	}
}

public class Ex03 {
	public static void main(String[] args) throws InvalidWithdraw {		//실제 예외를 발생시키는 부분에서는 throw 사용
		BankAccount ba = new BankAccount(-100000);		// 최저 잔금 저장
		ba.deposit(100000);
		ba.withdraw(100000);		// 출금 금액
		ba.withdraw(200000);
	}
}
