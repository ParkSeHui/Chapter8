// 20153015 �ڼ���
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int x = 0, y =0 , z = 0 ;
		Scanner input = new Scanner(System.in);
		System.out.println("���� �� �� �Է�: ");
		
		try{			// �� ���� ������ �Է� �޾� ���� ���� ����� ���
			x = input.nextInt();
			y = input.nextInt();
			z = x * y;
			System.out.printf("%d * %d = %d \n", x, y, z);
		} catch (Exception e) {			//������ �ƴ� ���� �ԷµǸ� ���� �߻��Ͽ� ���� �ߴ�
			System.out.println("���� �߻�: " + e);
		}	
	}
}