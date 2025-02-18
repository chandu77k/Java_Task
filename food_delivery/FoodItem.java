package food_delivery;
/**
 * FoodItem class extends the BasicFood class and inherits the methods from parent class
 */
class FoodItem extends BasicFood{
	/**
	 * @return food method gives the extra list of items according to the if condition
	 * @param item is taken as parameter. so that if input is equal to "pizza","burger","sandwitch"
	 * then it runs according to the if condition.
	 */
	public void food(String item) {
		if(item.equalsIgnoreCase("pizza")) {
			pizza();
			System.out.println("Extra Chicken in pizza");
			System.out.println("Extra veggies in pizza");
		}
		if(item.equalsIgnoreCase("burger")) {
			burger();
			System.out.println("Extra Chicken in burger");
			System.out.println("Extra veggies in burger");
		}
		if(item.equalsIgnoreCase("sandwitch")) {
			sandwitch();
			System.out.println("Extra Chicken in sandwitch");
			System.out.println("Extra veggies in sandwitch");
		}
	}
	/**
	 * @return In BasicFood class file sandwitch method is abstract. so the list of sandwitch is written here
	 */
	public void sandwitch(){
			System.out.println("Sandwitch-");
			System.out.println("Chicken sandwitch");
			System.out.println("veg sandwitch");
	}
}
