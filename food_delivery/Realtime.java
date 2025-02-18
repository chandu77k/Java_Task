package food_delivery;
/**
 * Realtime class implements delivery tracker interface
 */
class Realtime implements DeliveryTracker{
	/**
	 * @return startdelivery method returns the print statement
	 */
	public void startDelivery() {
		System.out.println("Realtime class Delivery Started");
	}
	/**
	 * @return trackprogress method returns the print statement
	 */
	public void trackProgress() {
		System.out.println("Realtime class Track Delivery");
	}
	/**
	 * @return completedelivery method returns the print statement
	 */
	public void completeDelivery() {
		System.out.println("Realtime class Delivery Completed");
	}
}
