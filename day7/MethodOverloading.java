package day7;
/**
 * This program describes usage of method overloading
 * @author chandrashekar
 * @apiNote Method Overloading
 */
public class MethodOverloading {
    void print(int alpha) {
        System.out.println("Integer: " + alpha);
    }
    void print(String str) {
        System.out.println("String: " + str);
    }
    void print(String str1, String str2) {
        System.out.println("Strings : " + str1 + " " + str2);
    }
    public static void main(String[] args) {
    	MethodOverloading loader = new MethodOverloading();
        loader.print(42);              
        loader.print("Hello Java");
        loader.print("Hello", "World");
    }	
}
