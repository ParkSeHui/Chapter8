// 20153015 �ڼ���
class InvalidWithdraw extends Exception {		//���ο� ���� ����
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg) {
		super(msg);
	}
}

class BankAccount {
	int min;		//���� �ܱ�
	int total=0;		// ���� �ܰ�
	
	public BankAccount(int min) {	// ���� �ܱ� ����
		this.min = min;
	}
	
	public void deposit(int money){		// �Ա� �޼ҵ�
		total += money;
		System.out.println("���� �Ա�ó�� : �Աݱݾ� = " + money + ", �ܱ� = "  + total);
	}
	
	public void withdraw(int money) throws InvalidWithdraw {		// ��� �޼ҵ�
		if(min > (total-money) || money <= 0) {		// ����� �ݾ��� ���� �ܱݺ��� �����̰ų� ����� �ݾ��� ������ ��� ���� �߻�
			throw new InvalidWithdraw("�ʰ���� �䱸 ����");		//���� �߻�
		}	
		else{
			total -= money;
			System.out.println("���� ���ó�� : ����ݾ� = " + money + ", �ܱ� = " + total );
		}	
	}
}

public class Ex03 {
	public static void main(String[] args) throws InvalidWithdraw {		//���� ���ܸ� �߻���Ű�� �κп����� throw ���
		BankAccount ba = new BankAccount(-100000);		// ���� �ܱ� ����
		ba.deposit(100000);
		ba.withdraw(100000);		// ��� �ݾ�
		ba.withdraw(200000);
	}
}
