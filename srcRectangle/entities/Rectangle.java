package entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	public double diagonal() {
		return Math.sqrt(height * height + width * width);
	}
	
	public void showResults() {
		System.out.printf("\nAREA = %.2f\nPERIMETER = %.2f\nDIAGONAL = %.2f"
				, area(), perimeter(), diagonal());		
	}
	
}
