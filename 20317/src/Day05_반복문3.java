import java.util.Scanner;

public class Day05_�ݺ���3 {
	public static void main(String[] args) {
	// ���ѷ����� ��� N�� �Է¹޾Ƽ�	
	// N�� 3�� ������� �ƴ����� ���� ����� �������
	// �̶� 0�� �ԷµǸ� �ݺ����� �����Ѵ�.
	// ���� N�� 3,6,9 �̸� ������� ���� �������� �Է¹޴´�.
		
		int N;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("N:");
			N = sc.nextInt();
			if( N==3 || N==6 || N==9 )
				continue;
			if(N==0)
				break;
			else if(N%3==0)
				System.out.println(N + "�� 3�� ��� ");
			else
				System.out.println(N + "�� 3�� ��� �ƴ�. ");
		
		System.out.println("N�Է�:");
		
		
		
		
		}
		System.out.println("Bye~!");
	}
}
