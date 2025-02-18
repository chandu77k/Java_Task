package food_delivery;
/**
 * DeliveryDriver class implements UserInterface interface
 */
class DeliveryDriver implements UserInterface{
	/**
	 * The values of deliverid,delivername,delivermobile are private
	 */
	private String driverId;
	private String driverName;
	private String driverMobile;
	/**
	 * @return setDriverId method sets the private variable driverId to public 
	 * @param driverId private variable is taken as input to access it and use it in another class
	 */
	public void setDriverId(String driverId) {
		this.driverId=driverId;
	}
	/**
	 * @return getDriverId method gets the data from setDriverId
	 */
	public String getDriverId() {
		return driverId;
	}
	/**
	 * @return setDriverName method sets the private variable driverName to public 
	 * @param driverName private variable is taken as input to access it and use it in another class
	 */
	public void setDriverName(String driverName) {
		this.driverName=driverName;
	}
	/**
	 * @return getDriverName method gets the data from setDriverName
	 */
	public String getDriverName() {
		return driverName;
	}
	/**
	 * @return setDriverMobile method sets the private variable driverMobile to public 
	 * @param driverMobile private variable is taken as input to access it and use it in another class
	 */
	public void setDriverMobile(String driverMobile) {
		this.driverMobile=driverMobile;
	}
	/**
	 * @return getDriverMobile method gets the data from setDriverMobile
	 */
	public String getDriverMobile() {
		return driverMobile;
	}
	
	/**
	 * @return login method is used for login the DeliveryDriver
	 */
	public void login() {
		System.out.println("DeliveryDriver Login");
	}
	/**
	 * @return register method is used to register the DeliveryDriver 
	 */
	public void register() {
		System.out.println("DeliveryDriver Register");
	}
	/**
	 * @return viewprofile method is used to see DeliveryDriver profile
	 */
	public void viewprofile() {
		System.out.println("DeliveryDriver Profile");
	}
	/**
	 * @return placeorder method is used to place order in DeliveryDriver class
	 */
	public void placeorder() {
		System.out.println("DeliveryDriver Placeorder");
	}
}