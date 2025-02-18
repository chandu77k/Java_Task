package food_delivery;
/**
 * Customer class implements UserInterface interface
 */
class Customer implements UserInterface{
	/**
	 * The values of custid,name,mobile are private
	 */
	private String custId;
	private String name;
	private String mobile;
	/**
	 * @return setCustId method sets the private variable to public 
	 * @param custId private variable is taken as input to access it and use it in another class
	 */
	public void setCustId(String custId) {
		this.custId=custId;
	}
	/**
	 * @return getCustId method gets the data from setCustId
	 */
	public String getCustId() {
		return custId;
	}
	/**
	 * @return setName method sets the private variable to public 
	 * @param name private variable is taken as input to access it and use it in another class
	 */
	public void setName(String name) {
		this.name=name;
	}
	/**
	 * @return getName method gets the data from setName
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return setMobile method sets the private variable to public 
	 * @param mobile private variable is taken as input to access it and use it in another class
	 */
	public void setMobile(String mobile) {
		this.mobile=mobile;
	}
	/**
	 * @return getMobile method gets the data from setMobile
	 */
	public String getMobile() {
		return mobile;
	}
	
	/**
	 * @return login method is used for login the customer 
	 */
	public void login() {
		System.out.println("Customer Login");
	}
	/**
	 * @return register method is used to register the customer 
	 */
	public void register() {
		System.out.println("Customer Register");
	}
	/**
	 * @return viewprofile method is used to see customer profile
	 */
	public void viewprofile() {
		System.out.println("Customer Profile");
	}
	/**
	 * @return placeorder method is used to place order for customer
	 */
	public void placeorder() {
		System.out.println("Customer Placeorder");
	}
}