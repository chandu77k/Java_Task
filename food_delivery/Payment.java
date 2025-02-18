package food_delivery;

class Payment{
	/**
	 * PaymentGateway is a static class
	 */
	 static class PaymentGateway{
		 /**
		  * @return processpayment method executes the print statement
		  */
		public void processPayment() {
			System.out.println("Processing Payment");
		}
		/**
		 * @return calculatedtotalamount method add the cost of items
		 * @param cost1 price of 1st item
		 * @param cost2 price of 2nd item
		 */
		public void calculateTotalAmount(int cost1,int cost2) {
			System.out.println("Calculated Payment : "+(cost1+cost2));
		}
	}
}
