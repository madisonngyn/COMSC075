
abstract class Shapes {
	private String name;
	abstract double area();		// abstract because area method will be used across subclasses	
}

class Circle extends Shapes {
	private double radius;
	
	public Circle (double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double area() {
		return (Math.PI * radius * radius);
	}
}

class Rectangle extends Shapes {
	private double height;
	private double width;
	
	public Rectangle (double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWidth() {
		return width;
	}
	
	double area() {
		return (width * height);
	}
}

class Triangle extends Shapes {
	private double height;
	private double base;
	
	public Triangle (double height, double base) {
		this.height = height;
		this.base = base;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getBase() {
		return base;
	}
	
	double area() {
		return ((base * height) / 2);
	}
}
