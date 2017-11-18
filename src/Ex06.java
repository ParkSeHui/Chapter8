//20153015 박세희
public class Ex06 {
	// PrimeNumber03 프로그램을 확인하는 클래스
	public static void main(String[] args) {
		new Thread(new PrimeNumber03(25), "소수 만드는 스레드").start();
	}
}
