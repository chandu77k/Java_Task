package food_delivery;
/**
 * BasicFood class extended by FoodItem, Menu classes and this classes have 
 * methods for printing list of pizzas,burgers and an abstract method
 */
public abstract class BasicFood{
	/**
	 *@return pizza method returns the list of pizzas
	 *@param its a default method. so it doesn't have any parameters
	 */
	public void pizza() {
		System.out.println("Pizza- ");
		System.out.println("Chicken pizza");
		System.out.println("Mushroom pizza");
	}
	/**
	 * @return burger method returns the list of burgers 
	 * @param its a default method. so it doesn't have any parameters
	 */
	public void burger() {
		System.out.println("Burger-");
		System.out.println("Chicken burger");
		System.out.println("veg burger");
	}
	/**
	 * @return sandwitch method is an abstract so its logic is written in the files 
	 * which extends BasicFood class
	 */
	public abstract void sandwitch();
}
