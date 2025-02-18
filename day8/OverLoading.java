package day8;
/**
 * This program is example of overloading
 * @author chandrashekar
 * @apiNote Method Overloading
 */
public class OverLoading {
	public static void orbit(String floor) {
		if(floor=="ground") {
			System.out.println("Orbit Reception");
		}
	}
	public static void orbit(int floor) {
		if(floor==6) {
		System.out.println("questk2");
		}
	}
	public static void orbit(float floor) {
		if(floor==12) {
		System.out.println("annblicks");
		}
	}
	public static void orbit(double floor) {
		if(floor==18) {
		System.out.println("acl");
		}
	}
	public static void orbit(long floor) {
		if(floor==24) {
			System.out.println("The Head Quarters");
		}
	}
	public static void main(String[] args) {
		orbit("ground");
		orbit(6);
		orbit(12f);
		orbit(18d);
		orbit(24l);	
	}
}