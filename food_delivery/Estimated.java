package food_delivery;
/**
 * estimated class implements DeliveryTracker interface.
 */
class Estimated implements DeliveryTracker{
	/**
	 * @return startDelivery method executes the print statement in that method
	 */
    public void startDelivery() {
		System.out.println("Estimated class Start Delivery");
	}
    /**
	 * @return trackProgress method executes the print statement in that method
	 */
	public void trackProgress() {
		System.out.println("Estimated class Track Progress");
	}
	/**
	 * @return completeDelivery method executes the print statement in that method
	 */
	public void completeDelivery() {
		System.out.println("Estimated class Complete Delivery");
	}
}