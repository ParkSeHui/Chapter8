//20153015 �ڼ���
public class PrimeNumber03 implements Runnable {
	
	int number;
	
	public PrimeNumber03(int number){		// ���� ����
		this.number = number;
	}
	
	public void run(){
		int count;
		System.out.println(Thread.currentThread().getName());
		for (int i = 2; i <= this.number; i++){		// �Ҽ� ���ϴ� for��
			count = 0;	
			for (int j=2; j<i; j++) {
				if(i%j == 0)
					count += 1;		// �Ҽ��� �ƴ�
			}
			if (count == 0)
				System.out.print(i + " ");		//�Ҽ� ���
		}
	}
}
