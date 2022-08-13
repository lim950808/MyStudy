package likelion;
// 5. �Է��� N���� ���ڿ� ���Ͽ� �Ҽ�(Prime Number)�� ���͸��Ͽ� �������ϱ�
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringJoiner;

public class test5 {
	
	public static boolean isPrime(int n) {
		for (int i=2; i<=(int)Math.sqrt(n); i++) {
			if (n % i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		StringJoiner sj = new StringJoiner(", ");
		int i = 1;
		int num = 99999;
		System.out.println("0�� �Է��Ͻø� �Է��� ���� �˴ϴ�.");
		Scanner sc = new Scanner(System.in);
		while (num != 0) {
			System.out.print("���� " + i + " : ");
			try {
				num = sc.nextInt();
				if (num == 0) break; 
				if (map.get(num) != null) {
					System.out.println("[�Է¿���] : �̹� �Էµ� �����Դϴ�.");
					continue;
				}
				map.put(num, 1);
				i++;
			}catch (Exception e) {
				sc = new Scanner(System.in);
				System.out.println("[�Է¿���] : ���ڷ� �Է����ּ���.");
			}	
		}
		
		for (Integer key: map.keySet()) {
			if (isPrime(key)) {
				sj.add(Integer.toString(key));
			}
		}
		System.out.print("��� : " + sj.toString());
		sc.close();
	}
}