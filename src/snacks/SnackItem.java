package snacks;

/**
 * @author Nataly Ayyad
 */

public class SnackItem {
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

	public static class Builder {
		private String name;
		private String location;
		private double price;
		private int amount;
		
		public Builder(String name) {
			this.name = name;
		}
		
		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setLocation(String location) {
			this.location = location;
			return this;
		}

		public Builder setPrice(double price) {
			this.price = price;
			return this;
		}

		public Builder setAmount(int amount) {
			this.amount = amount;
			return this;
		}
		
		/**
		 * Assign parameters from the builder class
		 */
		public SnackItem build() {
			SnackItem snackItem = new SnackItem();
			snackItem.name = this.name;
			snackItem.location = this.location;
			snackItem.price = this.price;
			snackItem.amount = this.amount;
			
			return snackItem;

		}
	}
	
	/* We made this constructor private for privacy
	 * We don't want someone to use the constructor of the object
	 * We will use the builder class instead
	 */
	public SnackItem() {
		
	}
	
	/**
	 * 
	 * @return the name of the snack
	 */
	public String getName() {
		return name;
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
