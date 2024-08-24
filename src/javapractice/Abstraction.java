package javapractice;

abstract class Vehicle {

	String color;

	public abstract void move();

	void drive() {

		System.out.println("drive....");

	}

	Vehicle(String color) {

		this.color = color;

	}
	public String getColor() {
		return color;
		
	}

}

class Car extends Vehicle {

	Car(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("move....");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car("Red");
		String color = c.color;
		System.out.println(color);
		c.move();
		c.drive();
		System.out.println(c.getColor());
	}
}
