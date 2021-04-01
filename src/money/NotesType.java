package money;

public enum NotesType {
	TWENTYDOLLARS(20),
	FIFTYDOLLARS(50);
	
	private double value;
	
	private NotesType(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}

}
