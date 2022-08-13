package likelion;
// 3. 콘솔 창에서 10개의 숫자를 입력 받은 후 오름차순으로 정렬하여 그 결과를 출력
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
				System.out.print("숫자 " + i + " : ");
				try {
					arr[i-1] = sc.nextInt();
					break;
				}catch (Exception e) {
					sc = new Scanner(System.in);
					System.out.println("[입력오류] : 숫자로 입력해주세요.");
				}
			}
		}

		for(int val: arr) {
			sj.add(Integer.toString(val));
		}
		System.out.print("결과 : " + sj.toString());	
	}
}