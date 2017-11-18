//20153015 박세희
import java.util.Date;

public class PrintTime implements Runnable {		//Runnable 구현하는 클래스
	
	int num;
	
	public PrintTime(int num){	// 개수를 지정해줌
		this.num = num;
	}
	
	public void run(){
		Date dt = new Date();
		for (int i = 1; i <= this.num; i++) {
			System.out.println("순위 : " + Thread.currentThread().getPriority() + " " + dt + " " + Thread.currentThread().getName());
		}
				// 지정된 개수동안 순위, 날짜, 이름 출력
	}
}
