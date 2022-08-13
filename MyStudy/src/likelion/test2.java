package likelion;
// 2. 콘솔 창에서 10개의 숫자를 입력 받아 두 수를 더한 값을 결과로 출력
import java.util.Scanner;

public class test2 {
	
	public static void main(String[] args) {
		int arr[] = new int[11];
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		for (int i=1; i<arr.length; i++) {
			while (true) {
				System.out.print("숫자 " + i + " : ");
				try {
					arr[i] = sc.nextInt();
					break;
				}catch (Exception e) {
					sc = new Scanner(System.in);
					System.out.println("[입력오류] : 숫자로 입력해주세요.");
				}
			}
		}

		for(int val: arr) {
			result += val;
		}
		System.out.print("결과 : " + result);	
	}
}