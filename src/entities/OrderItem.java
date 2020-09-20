package entities;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	
	private Productt productt;
	

	public OrderItem(Integer quantity, Double price, Productt productt) {	
		this.quantity = quantity;
		this.price = price;
		this.productt = productt;
	}

	public Integer getQuantity() {
		return quantity;
	}
	

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public Productt getProductt() {
		return productt;
	}


	public void setProductt(Productt productt) {
		this.productt = productt;
	}


	public Double subTotal() {    	
	       return quantity * price;
    }
	
	@Override
	public String toString() {
		return productt.getName()
				         + ", $"
				         + String.format("%.2f", price)
				         + ", Quantity: "
				         + quantity 
				         + ", Subtotal: $"
				         + String.format("%.2f", subTotal());		
	}


}
