package day7;
/**
 * This program refers to variables, methods
 * @author chandrashekar
 * @apiNote Use of variables and methods
 */
public class Details {
	private String name;
	private String branch;
	private int age;
	public void info(String name,String branch,int age) {
		this.name=name;
		this.branch=branch;
		this.age=age;
	}
	public void display(String name,String branch,int age) {
		System.out.println("Name : "+name);
		System.out.println("Branch : "+branch);
		System.out.println("Age : "+age);
	}

	public static void main(String[] args) {
		Details details=new Details();
		details.display("chandu","CSE",22);

	}

}
