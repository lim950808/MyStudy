package likelion;
// 3. �ܼ� â���� 10���� ���ڸ� �Է� ���� �� ������������ �����Ͽ� �� ����� ���
import java.util.Scanner;
import java.util.StringJoiner;

public class test3 {
	
	public static void main(String[] args) {
		int arr[] = new int[10];
		StringJoiner sj = new StringJoiner(", ");
		String result = "";
		
		Scanner sc = new Scanner(System.in);
		for (int i=1; i<=arr.length; i++) {
			while (true) {
				System.out.print("���� " + i + " : ");
				try {
					arr[i-1] = sc.nextInt();
					break;
				}catch (Exception e) {
					sc = new Scanner(System.in);
					System.out.println("[�Է¿���] : ���ڷ� �Է����ּ���.");
				}
			}
		}

		for(int val: arr) {
			sj.add(Integer.toString(val));
		}
		System.out.print("��� : " + sj.toString());	
	}
}