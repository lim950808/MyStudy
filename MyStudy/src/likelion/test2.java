package likelion;
// 2. �ܼ� â���� 10���� ���ڸ� �Է� �޾� �� ���� ���� ���� ����� ���
import java.util.Scanner;

public class test2 {
	
	public static void main(String[] args) {
		int arr[] = new int[11];
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		for (int i=1; i<arr.length; i++) {
			while (true) {
				System.out.print("���� " + i + " : ");
				try {
					arr[i] = sc.nextInt();
					break;
				}catch (Exception e) {
					sc = new Scanner(System.in);
					System.out.println("[�Է¿���] : ���ڷ� �Է����ּ���.");
				}
			}
		}

		for(int val: arr) {
			result += val;
		}
		System.out.print("��� : " + result);	
	}
}