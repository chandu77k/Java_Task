package food_delivery;
/**
 * This interface implemented by different classes like customer,restaurant,delivery driver
 */
interface UserInterface{
	/**
	 * login method logic is written in the classes that implements UserInterface interface 
	 */
	public void login();
	/**
	 * register method logic is written in the classes that implements UserInterface interface 
	 */

	public void register();
	/**
	 * viewprofile method logic is written in the classes that implements UserInterface interface 
	 */

	public void viewprofile();
	/**
	 * placeorder method logic is written in the classes that implements UserInterface interface 
	 */

	public void placeorder();
}
