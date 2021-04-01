package snacks;
/**
 * @author Nataly Ayyad
 */

public class SnackItemBackup {
	private String name;
	private String location;
	private double price;
	private int amount;
	
	/**
	 * 
	 * @param name
	 * @param price
	 * @param location
	 * @param amount
	 */
	
	/**
	 * 
	 * @return the name of the snack
	 */
	public String getName() {
		return name;
	}
	public SnackItemBackup(String name, String location, double price, int amount) {
		this.name = name;
		this.location = location;
		this.price = price;
		this.amount = amount;
	}
	/**
	 * 
	 * @param name: setting the name of the snack
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @return the price of the snack
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * 
	 * @param price: setting the price of the snack
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * 
	 * @return the location of the snack in the vending machine
	 */
	public String getLocation() {
		return location;
	}
	
	/**
	 * 
	 * @param location: setting the location of the snack in the vending machine
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
	/**
	 * 
	 * @return the amount of snacks available 
	 */
	public int getAmount() {
		return amount;
	}
	
	/**
	 * 
	 * @param amount: setting the amount of a snack
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public boolean isAvailable() {
		return this.amount > 0;
	}
	
	public void addToAmount(int number) {
		this.amount += number;
	}
	
	public void reduceAmount (int number) {
		this.amount -= number;
	}
	

}
