// 20153015 �ڼ���
class InvalidWithdraw1 extends Exception {		//���ο� ���� ����
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw1(String msg) {
		super(msg);
	}
}

class BankAccount1 {
	int min;		//���� �ܱ�
	int total=0;		// ���� �ܰ�
	
	public BankAccount1(int min) {	// ���� �ܱ� ����
		this.min = min;
	}
	
	public void deposit(int money){		// �Ա� �޼ҵ�
		total += money;
		System.out.println(money  +  "�� �Ա��Ͽ� ���� �ܰ��  "  + total + "�� �Դϴ�.");
	}
	
	public void withdraw1(int money) {		// ��� �޼ҵ�
		if(min > (total-money) || money <= 0) {		// ����� �ݾ��� ���� �ܱݺ��� �����̰ų� ����� �ݾ��� ������ ��� ���� �߻�
			InvalidWithdraw1 i = new InvalidWithdraw1("����� �� �����ϴ�.");
			System.out.println(i);
		}	
		else{
			total -= money;
			System.out.println(money + "�� ����Ͽ� ���� �ܰ��  " + total + "�� �Դϴ�." );
		}	
	}
}

public class Ex02 {

	public static void main(String[] args) {
		BankAccount1 ba = new BankAccount1(-100000);		// ���� �ܱ� ����
		ba.withdraw1(500000);		// ��� �ݾ�
	}

}
