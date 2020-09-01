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
		System.out.println("몇 번째 좌석을 예약하시겠습니까?");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		if(seats[s] == 0) {
			seats[s-1] = 1;
			System.out.println(s+"번째 좌석이 예약되었습니다.");
		}
		else if(seats[s] == 1) {
			System.out.println("선택하신 좌석은 이미 예약이 되어있습니다.");
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
			System.out.println(num+1 + "번째 손님 예약");
			r.reserve();
			r.print();
		}
		
	}

}
