package money;

public enum CoinType {
	TENCENTS(0.10),
	TWENTYCENTS(0.20),
	FIFTYCENTS(0.50),
	ONEDOLLAR(1);
	
	private double value;

	private CoinType(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}
	
	
}
