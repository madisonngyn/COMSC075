class Rectangles {
    
    private double length;
    private double width;
    private static int numRect = 0;
    
    public Rectangles() {
		this.length = 0;
		this.width = 0;
		numRect++;
	}
    
    public Rectangles(double length, double width) {
        this.length = length;
		this.width = width;
		numRect++;
    }
    
    public double getLength() {
        return this.length;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public double getWidth() {
        return this.width;
    }
    
    public void setWidth(double width) {
		this.width = width;
    }
    
    public static int getNumRect() {
        return numRect;
    }
    
    public double getArea() {
        return this.length * this.width;
    }
    
    public boolean isSquare() {
        if (length == width) {
            return true;
        }
        else {
            return false;
        }
    }
}

public class Rectangle {
	public static void main (String [] args) {
		Rectangles rectangle1 = new Rectangles (3,7);
		Rectangles rectangle2 = new Rectangles (4,50);
		Rectangles rectangle3 = new Rectangles (10,10);
		
		System.out.println(rectangle1.getArea());
		System.out.println(Rectangles.getNumRect());
		System.out.println(rectangle3.isSquare());
	}
}
