
public class Box {
	double breadth;
	double height;
	double length;
	Box(double l, double b, double h){
		breadth = b;
		length = l;
		height = h;
	}
	double Boxdemo() {
		return length * breadth * height;
	}
}
