class Box{
	int width;
	int length;
	int height;
	
	int getWidth(){
		return width;
	}
	void setWidth(int w) {
		width = w;
	}
	int getLength(){
		return width;
	}
	void setLength(int l) {
		length = l;
	}
	int getHeight(){
		return height;
	}
	void setHeight(int h) {
		height = h;
	}
	int getVolume() {
		return width * length * height;
	}
	void print() {
		System.out.println("가로: " + width);
		System.out.println("세로: " + length);
		System.out.println("높이: " + height);
		System.out.println("부피: " + width * length * height);
	}
}

class circle{
	
	private double radius;
	private static double PI = 3.141592;
	
	public circle (double r) {
		radius = r;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double r) {
		radius = r;
	}
	public double square() {
		return radius * radius;
	}
	public double getArea() {
		return square() * PI;
	}
	public double getPerimeter() {
		return 2 * radius * PI;
	}
	public static double getPI() {
		return PI;
	}
	
	public static void main(String args[]) {
		getPI();
	}
}

public class CircleTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box1 = new Box();
		box1.setWidth(100);
		box1.setLength(100);
		box1.setHeight(100);
		System.out.println(box1.getVolume());
		Box box2 = new Box();
		box2.setWidth(200);
		box2.setLength(200);
		box2.setHeight(200);
		box2 = box1;
		box2.print();
		
		circle c = new circle(5.0);
		System.out.println("넓이: " + c.getArea());
		System.out.println("둘레: " + c.getPerimeter());
	}

}
