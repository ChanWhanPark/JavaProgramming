import java.util.Scanner;
public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ʿ��� ���� ����
		int num;
		int i, j, k, m , n;
		// 1~15 ������ �������� �Է� ����
		Scanner s = new Scanner(System.in);
		System.out.print("�غ��� ���̸� �Է��ϼ���(1-15): ");
		num = s.nextInt();
		
		//�ﰢ�� ����
		System.out.println("�ﰢ�� �׸���");
		for(i=1;i<=num;i++) {
			for(j=num;j>=i;j--)
				System.out.print(" ");
			for(k=1;k<=i;k++) {
				if(i <= 9) {
					System.out.print(" " + i);
				}
				else if(i >= 10)
					System.out.print(" " + (char)(i+87));
			}
				
			
			System.out.println();
		}
		
		//���ﰢ�� ����
		System.out.println("���ﰢ�� �׸���");
		for(i=num;i>=1;i--) {
			for(j=num;j>=i;j--)
				System.out.print(" ");
			for(k=1;k<=i;k++) {
				if(i <= 9) {
					System.out.print(" " + i);
				}
				else if(i >= 10)
					System.out.print(" " + (char)(i+87));
			}
			System.out.println();	
		}
		//�𷡽ð� ����
		System.out.println("�𷡽ð� �׸���");
		for(i=num;i>=1;i--) {
			for(j=num;j>=i;j--)
				System.out.print(" ");
			for(k=1;k<=i;k++) {
				if(i <= 9) {
					System.out.print(" " + i);
				}
				else if(i >= 10)
					System.out.print(" " + (char)(i+87));
			}
			System.out.println();
		}
		for(i=2;i<=num;i++) {
			for(m=num;m>=i;m--)
				System.out.print(" ");
			for(n=1;n<=i;n++)
				if(i <= 9) {
					System.out.print(" " + i);
				}
				else if(i >= 10)
					System.out.print(" " + (char)(i+87));
			System.out.println();
		}
	}

}
