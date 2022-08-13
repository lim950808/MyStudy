package likelion;
// 4. 숫자 0을 입력하기 전까지 계속해서 숫자 입력을 받은 후, 그 결과를 리스트 형태로 출력
import java.util.Scanner;
import java.util.StringJoiner;

public class test4 {

	public static void main(String[] args) {
		int i = 1;
		StringJoiner sj = new StringJoiner(", ");
		int num = -99999;
		
		System.out.println("0을 입력하시면 입력이 종료 됩니다.");
		while (num != 0) {
			Scanner sc = new Scanner(System.in);
			try {
				System.out.print("숫자 " + i + ": ");
				num = sc.nextInt();
				if (num == 0) break;
				sj.add(Integer.toString(num));
				i++;
			}
			catch(Exception e) {
				sc = new Scanner(System.in);
				System.out.println("[입력오류] : 숫자로 입력해주세요.");
			}
		}
		System.out.println("결과 : " + sj.toString());
	}
}