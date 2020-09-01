class Circle{
	double radius;
	String color;
	public Circle() {
		radius = 10;
		color = "red";
	}
	public Circle(double r) {
		radius = r;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return radius * radius * 3.141592;
	}
}

class Cylinder extends Circle{
	double height;
	public Cylinder() {
		super();
		height = 1.0;
	}
	public Cylinder(double r) {
		radius = r;
	}
	public Cylinder(double r, double h) {
		radius = r;
		height = h;
	}
	public double getHeight() {
		return height;
	}
	public double getVolume() {
		return getArea() * getHeight();
	}
}
public class TestCylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder obj1 = new Cylinder();
		System.out.println("obj1의 높이: " + obj1.getHeight());
		System.out.println("obj1의 반지름: " + obj1.getRadius());
		System.out.println("obj1의 부피: " + obj1.getVolume());
		
		Cylinder obj2 = new Cylinder(5.0, 3.0);
		System.out.println("obj2의 높이: " + obj2.getHeight());
		System.out.println("obj2의 반지름: " + obj2.getRadius());
		System.out.println("obj2의 넓이: " + obj2.getArea());
		System.out.println("obj2의 부피: " + obj2.getVolume());
		
	}

}
