
abstract class Shape {
	public abstract double surface_area();
	public abstract double volume();
}

class Sphere extends Shape {
	private double radius;
	
	public Sphere(double radius) {
		this.radius = radius;
	}
	public double surface_area() {
		return 4 * Math.PI * radius * radius;
	}
	
	public double volume() {
	return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
	}
	
	public String toString() {
		return "Sphere - Surface Area: " + surface_area() + ", Volume: " + volume();
	}
}
class Cylinder extends Shape {
	private double radius;
	private double height;
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	public double surface_area() {
		return 2 * Math.PI * radius * (radius + height);
	}
	
	public double volume() {
		return Math.PI * radius * radius * height;
	}
	
	public String toString() {
		return "Cylinder - Surface Area: " + surface_area() + ", Volume: " + volume();
	}
}
class Cone extends Shape {
	private double radius;
	private double height;
	
	public Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	public double surface_area() {
		return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
	}
	
	public double volume() {
		return (1.0 / 3) * Math.PI * radius * radius * height;
	}
	
	public String toString() {
		return "Cone - Surface Area: " + surface_area() + ", Volume: " + volume();
	}
}
public class ShapeArray {
	public static void main(String[] args) {
		// Instantiate a sphere, cylinder, and cone
		Sphere sphere = new Sphere(5); // Radius 5
		Cylinder cylinder = new Cylinder(3, 5); // Radius 3, Height 5
		Cone cone = new Cone(4, 6); // Radius 4, Height 6
		
		// Store the instances in an array
		Shape [] shapeArray = {sphere, cylinder, cone};
		
		// Loop through array and print out instance data of each object
		for (Shape shape : shapeArray) {
			System.out.println(shape.toString());
		}



	}

}
