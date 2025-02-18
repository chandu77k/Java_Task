package day7;
/**
 * This program refer to inheritance topic
 * @author chandrashekar
 * @apiNote Inheritance program
 */
class Parent {
	public void details() {
		System.out.println("Parent class");
	}
}
class Child extends Parent{
	public void display(String name,int age) {
		System.out.println("Name : "+name+" Age : "+age );
	}
}
public class Inherit{
	public static void main(String[] args) {
		Child child=new Child();
		child.display("chandu",22);
		child.details();
	}
}