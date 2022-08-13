package likelion;
// 5. 입력한 N개의 숫자에 대하여 소수(Prime Number)만 필터링하여 리스팅하기
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
		System.out.println("0을 입력하시면 입력이 종료 됩니다.");
		Scanner sc = new Scanner(System.in);
		while (num != 0) {
			System.out.print("숫자 " + i + " : ");
			try {
				num = sc.nextInt();
				if (num == 0) break; 
				if (map.get(num) != null) {
					System.out.println("[입력오류] : 이미 입력된 숫자입니다.");
					continue;
				}
				map.put(num, 1);
				i++;
			}catch (Exception e) {
				sc = new Scanner(System.in);
				System.out.println("[입력오류] : 숫자로 입력해주세요.");
			}	
		}
		
		for (Integer key: map.keySet()) {
			if (isPrime(key)) {
				sj.add(Integer.toString(key));
			}
		}
		System.out.print("결과 : " + sj.toString());
		sc.close();
	}
}