package food_delivery;
/**
 * Restaurant class implements methods in UserInterface interface
 */
class Restaurant implements UserInterface{
	/**
	 * The values of restoid,restoname,restomobile are private
	 */
	private String restoId;
	private String restoName;
	private String restoMobile;
	/**
	 * @return setRestoId method sets the private variable to public 
	 * @param restoId private variable is taken as input to access it and use it in another class
	 */
	public void setRestoId(String restoId) {
		this.restoId=restoId;
	}
	/**
	 * @return getRestoId method gets the data from setRestoId
	 */
	public String getRestoId() {
		return restoId;
	}
	/**
	 * @return setRestoName method sets the private variable to public 
	 * @param restoname private variable is taken as input to access it and use it in another class
	 */
	public void setRestoName(String restoName) {
		this.restoName=restoName;
	}
	/**
	 * @return getRestoName method gets the data from setRestoName
	 */
	public String getRestoName() {
		return restoName;
	}
	/**
	 * @return setRestoMobile method sets the private variable to public 
	 * @param restomobile private variable is taken as input to access it and use it in another class
	 */
	public void setRestoMobile(String restoMobile) {
		this.restoMobile=restoMobile;
	}
	/**
	 * @return getRestoMobile method gets the data from setRestoMobile
	 */
	public String getRestoMobile() {
		return restoMobile;
	}
	
	/**
	 * @return login method is used for login the Restaurant 
	 */
	public void login() {
		System.out.println("Restaurant Login");
	}
	/**
	 * @return register method is used to register the Restaurant 
	 */
	public void register() {
		System.out.println("Restaurant Register");
	}
	/**
	 * @return viewprofile method is used to see Restaurant  profile
	 */
	public void viewprofile() {
		System.out.println("Restaurant Profile");
	}
	/**
	 * @return placeorder method is used to place order for Restaurant 
	 */
	public void placeorder() {
		System.out.println("Restaurant Placeorder");
	}
}