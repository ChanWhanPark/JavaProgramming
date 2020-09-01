import java.util.Scanner;

class Reservation{
	int [] seats;
	int size;
	public Reservation(int size) {
		this.size = size;
		seats = new int[size];
	}
	public void print() {
		System.out.println("------------------------------");
		for(int i=0;i<size;i++) 
			System.out.print(i+1 + " ");
		System.out.println("\n----------------------------");
		for(int i=0;i<size;i++)
			System.out.print(seats[i]+ " ");
		System.out.println("\n----------------------------");
	}
	public void reserve() {
		System.out.println("�� ��° �¼��� �����Ͻðڽ��ϱ�?");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		if(seats[s] == 0) {
			seats[s-1] = 1;
			System.out.println(s+"��° �¼��� ����Ǿ����ϴ�.");
		}
		else if(seats[s] == 1) {
			System.out.println("�����Ͻ� �¼��� �̹� ������ �Ǿ��ֽ��ϴ�.");
		}
		
		
	}
}
public class Theater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reservation r = new Reservation(10);
		int num;
		r.print();
		for(num=0;num<10;num++) {
			System.out.println(num+1 + "��° �մ� ����");
			r.reserve();
			r.print();
		}
		
	}

}
