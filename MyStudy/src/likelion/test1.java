package likelion;
// 1. �ܼ� â���� �� ���� ���ڸ� �Է� �޾� �� ���� ���� ���� ����� ���
import java.util.Scanner;

public class test1 {
	
	public static void main(String[] args) {
		int num1, num2;
		int result;
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("ù��° ���ڸ� �Է����ּ��� : ");
			try {
				num1 = sc.nextInt();
				break;
			}catch (Exception e) {
				sc = new Scanner(System.in);
				System.out.println("[�Է¿���] : ���ڷ� �Է����ּ���.");
			}
		}
		while (true) {
			System.out.print("�ι�° ���ڸ� �Է����ּ��� : ");
			try {
				num2 = sc.nextInt();
				break;
			}catch (Exception e) {
				sc = new Scanner(System.in);
				System.out.println("[�Է¿���] : ���ڷ� �Է����ּ���.");
			}
		}
		result = num1 + num2;
		System.out.print("��� : " + result);	
	}
}