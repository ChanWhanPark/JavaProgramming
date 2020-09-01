import java.util.Scanner;
public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//필요한 변수 선언
		int num;
		int i, j, k, m , n;
		// 1~15 사이의 정수값을 입력 받음
		Scanner s = new Scanner(System.in);
		System.out.print("밑변의 길이를 입력하세요(1-15): ");
		num = s.nextInt();
		
		//삼각형 구현
		System.out.println("삼각형 그리기");
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
		
		//역삼각형 구현
		System.out.println("역삼각형 그리기");
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
		//모래시계 구현
		System.out.println("모래시계 그리기");
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
