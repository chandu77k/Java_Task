package day7;
/**
 * This program explains usage of constructor
 * @author chandrashekar
 * @apiNote Usage of constructor
 */
public class UseConstructor {
	private String name;
	private int age;
	public UseConstructor(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		UseConstructor constructor=new UseConstructor("Chandu",22);
		System.out.println("Name : "+constructor.getName());
		System.out.println("Age : "+constructor.getAge());

	}

}
