package day8;
/**
 * This program describes area of circle and area of rectangle
 * @author chandrashekar
 * @apiNote Area of circle and rectangle
 */
abstract class Shape {
 public abstract double Area();
}

class Circle extends Shape {
 private double radius;
 public Circle(double radius) {
     this.radius = radius;
 }
 public double Area() {
     return 3.14*radius*radius;
 }
}

class Rectangle extends Shape {
 private double length;
 private double width;
 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 public double Area() {
     return length * width;
 }
}

public class AbstractMethod {
	public static void main(String[] args) {
	     Shape circle = new Circle(7);
	     Shape rectangle = new Rectangle(7,4);
	     System.out.println("Area of Circle: " + circle.Area());
	     System.out.println("Area of Rectangle: " + rectangle.Area());
	 }

}
