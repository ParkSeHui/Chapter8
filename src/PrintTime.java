//20153015 �ڼ���
import java.util.Date;

public class PrintTime implements Runnable {		//Runnable �����ϴ� Ŭ����
	
	int num;
	
	public PrintTime(int num){	// ������ ��������
		this.num = num;
	}
	
	public void run(){
		Date dt = new Date();
		for (int i = 1; i <= this.num; i++) {
			System.out.println("���� : " + Thread.currentThread().getPriority() + " " + dt + " " + Thread.currentThread().getName());
		}
				// ������ �������� ����, ��¥, �̸� ���
	}
}
