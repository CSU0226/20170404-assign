public class Cylinder {
	Circle cir;
	double hei;

	public Cylinder(Circle circle, double height) {
		this.cir = circle;
		this.hei = height;
	}
	double getVolume() {
		double Volume = cir.getArea() * hei;
		return Volume;
	}
	public static void main(String[] args) {
		Cylinder cd = new Cylinder(new Circle(2.8), 5.6);
		System.out.println("원통의 부피 = " + cd.getVolume());
	}
}
