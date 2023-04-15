package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;

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
