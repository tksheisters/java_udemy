package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public Product() {
		
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double totalValueStock() {
		double value = price * quantity;
		return value;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return "Name: " + name.toUpperCase() + ", Price: $" + String.format("%.2f", price) + ", Quantity: " + quantity
				+ ", Total: " + String.format("%.2f", totalValueStock());

	}
}
