//20153015 박세희
public class PrimeNumber03 implements Runnable {
	
	int number;
	
	public PrimeNumber03(int number){		// 개수 지정
		this.number = number;
	}
	
	public void run(){
		int count;
		System.out.println(Thread.currentThread().getName());
		for (int i = 2; i <= this.number; i++){		// 소수 구하는 for문
			count = 0;	
			for (int j=2; j<i; j++) {
				if(i%j == 0)
					count += 1;		// 소수가 아님
			}
			if (count == 0)
				System.out.print(i + " ");		//소수 출력
		}
	}
}
