package likelion;
// 1. 두 수를 입력 받아서 더하기
import java.util.Scanner;

public class test1 {
	
	public static void main(String[] args) {
		int num1, num2;
		int result;
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("첫번째 숫자를 입력해주세요 : ");
			try {
				num1 = sc.nextInt();
				break;
			}catch (Exception e){
				sc = new Scanner(System.in);
				System.out.println("[입력오류] : 숫자로 입력해주세요.");
			}
		}
		while (true) {
			System.out.print("두번째 숫자를 입력해주세요 : ");
			try {
				num2 = sc.nextInt();
				break;
			}catch (Exception e) {
				sc = new Scanner(System.in);
				System.out.println("[입력오류] : 숫자로 입력해주세요.");
			}
		}
		result = num1 + num2;
		System.out.print("결과 : "+result);
			
	}
}