package food_delivery;
/**
 * Menu class extends the BasicFood class and inherits the methods from parent class
 */
class Menu extends BasicFood{
	/**
	 * @return list method performs the operation in pizza method and burger method
	 */
	public void lists() {
		System.out.println("\nMenu : ");
		pizza();
		burger();
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

