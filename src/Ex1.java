// 20153015 박세희
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int x = 0, y =0 , z = 0 ;
		Scanner input = new Scanner(System.in);
		System.out.println("정수 두 개 입력: ");
		
		try{			// 두 개의 정수를 입력 받아 곱셈 연산 결과를 출력
			x = input.nextInt();
			y = input.nextInt();
			z = x * y;
			System.out.printf("%d * %d = %d \n", x, y, z);
		} catch (Exception e) {			//정수가 아닌 값이 입력되면 예외 발생하여 실행 중단
			System.out.println("예외 발생: " + e);
		}	
	}
}
