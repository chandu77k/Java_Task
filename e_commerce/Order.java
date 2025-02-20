package e_commerce;

public class Order {
	private String orderId;
	private String name;
	private boolean processed;
	public Order(String orderId,String name,boolean processed){
		this.orderId=orderId;
		this.name=name;
		this.processed=processed;
	}
	public String toString() {
		return "Order Id : "+orderId+" Customer : "+name+" Processed : "+processed;		
	}
	public String getOrderId() {
		return orderId;
	}
	public String getCustomer() {
		return name;
	}
	public boolean getProcessed() {
		return processed;
	}
	public void orderProcessed() {
		this.processed=true;
	}

}
