package likelion;
// 6. �Խù� ����� �� �� �ִ� ��ɾ�� ����� �Խù��� ��ȸ�� �� �ִ� ��ɾ ���� ���α׷�
import java.util.Scanner;

public class test6 {
	public static String[][] stack = new String[2][9999];
	public static int size = 0;
	
	
	public static void main(String[] args) {
		String sender = "";
		String text = "";
		int i = 1;
		
		System.out.println("��ɾ� �ϳ��� �����ϼ��� : ���, ��ȸ, ����");
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("��ɾ�) ");
			sender = sc.next();
			try {
				if (sender.equals("���")) {
					sc = new Scanner(System.in);
					System.out.print("���� : ");
					text = sc.nextLine();
					registerTitle(text);
					sc = new Scanner(System.in);
					System.out.print("���� : ");
					text = sc.next();
					registerSentence(text);
					System.out.println("[�˸�] " + i + "������ ��ϵǾ����ϴ�.");
					i++;
				}else if(sender.equals("��ȸ")) {
					System.out.println("��ȣ / ����");
					System.out.println("------------------------");
					for(int j=size-1; j>=0; j--) {
						try {
							System.out.println((j+1) + " / " + stack[0][j]);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}else if(sender.equals("����")) {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}else {
					System.out.println("���, ��ȸ, ���� �� �ϳ��� �������ּ���.");
				}
			}catch(Exception e) {
				continue;
			}
		}
	}
	
	public static void registerTitle(String item) {
		stack[0][size] = item;
		size ++;
	}
	
	public static void registerSentence(String item) {
		stack[1][size] = item;
	}
}