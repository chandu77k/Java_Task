package day7;
/**
 * This program describes usage of constructor overloading
 * @author chandrashekar
 * @apiNote Constructor Overloading
 */
public class ConstructorOverloading {
	String name;
    String director;
    int releaseYear;
    double rating;
    ConstructorOverloading() {
        name = "Laila";
        director = "xyz";
        releaseYear = 2025;
    }
    ConstructorOverloading(String name, String director) {
        this.name = name;
        this.director = director;
        this.releaseYear = 2024;
    }
    
    void display() {
        System.out.println("Movie Name: " + name + ", Director: " + director + ", Release Year: " + releaseYear);
    }
    public static void main(String[] args) {
    	ConstructorOverloading movie1 = new ConstructorOverloading();
    	movie1.display();
        ConstructorOverloading movie2 = new ConstructorOverloading("Pushpa", "Sukumar");
        movie2.display();
    }

}
