package likelion;
// 4. ���� 0�� �Է��ϱ� ������ ����ؼ� ���� �Է��� ���� ��, �� ����� ����Ʈ ���·� ���
import java.util.Scanner;
import java.util.StringJoiner;

public class test4 {

	public static void main(String[] args) {
		int i = 1;
		StringJoiner sj = new StringJoiner(", ");
		int num = -99999;
		
		System.out.println("0�� �Է��Ͻø� �Է��� ���� �˴ϴ�.");
		while (num != 0) {
			Scanner sc = new Scanner(System.in);
			try {
				System.out.print("���� " + i + ": ");
				num = sc.nextInt();
				if (num == 0) break;
				sj.add(Integer.toString(num));
				i++;
			}
			catch(Exception e) {
				sc = new Scanner(System.in);
				System.out.println("[�Է¿���] : ���ڷ� �Է����ּ���.");
			}
		}
		System.out.println("��� : " + sj.toString());
	}
}