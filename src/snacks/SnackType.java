package snacks;

import money.CoinType;
import money.NotesType;
/**
 * 
 * @author Nataly Ayyad
 * This classs represents all snack type available in stock uses Builder pattern
 */
public enum SnackType {
	//ROW A
	LAYS(new SnackItem.Builder("Lays")
			.setName("LAYS")
			.setLocation("A1")
			.setPrice(CoinType.FIFTYCENTS.getValue() + 2 * CoinType.ONEDOLLAR.getValue())
			.setAmount(5)
			.build()),
	
	CHEETOS(new SnackItem.Builder("Cheetos")
			.setName("Cheetos")
			.setLocation("A2")
			.setPrice(CoinType.TENCENTS.getValue() +  CoinType.ONEDOLLAR.getValue())
			.setAmount(5)
			.build()),
	
	PRINGLES(new SnackItem.Builder("Pringles")
			.setName("Pringles")
			.setLocation("A3")
			.setPrice(CoinType.TWENTYCENTS.getValue() + 3 * CoinType.ONEDOLLAR.getValue())
			.setAmount(5)
			.build()),
	
	// ROW B
	COKE(new SnackItem.Builder("Coke")
			.setName("Coke")
			.setLocation("B1")
			.setPrice(4 * CoinType.TWENTYCENTS.getValue() + CoinType.TENCENTS.getValue())
			.setAmount(5)
			.build()),
	WATER(new SnackItem.Builder("Water")
			.setName("Water")
			.setLocation("B2")
			.setPrice(CoinType.TWENTYCENTS.getValue())
			.setAmount(5)
			.build()),
	PEPSI(new SnackItem.Builder("Pepsi")
			.setName("Pepsi")
			.setLocation("B3")
			.setPrice(4 * CoinType.TWENTYCENTS.getValue() + CoinType.TENCENTS.getValue())
			.setAmount(5)
			.build()),
	
	// ROW C
	TWIX(new SnackItem.Builder("Twix")
			.setName("Twix")
			.setLocation("C1")
			.setPrice(CoinType.ONEDOLLAR.getValue() + 2 * CoinType.TWENTYCENTS.getValue())
			.setAmount(5)
			.build()),
	
	SNICKERS(new SnackItem.Builder("Snickers")
			.setName("Snickers")
			.setLocation("C2")
			.setPrice(3 * CoinType.ONEDOLLAR.getValue() + 2 * CoinType.TWENTYCENTS.getValue())
			.setAmount(5)
			.build()),
	MNMS(new SnackItem.Builder("m & m's")
			.setName("m & m's")
			.setLocation("C3")
			.setPrice(3 * CoinType.ONEDOLLAR.getValue() + 2 * CoinType.TWENTYCENTS.getValue())
			.setAmount(5)
			.build()),
	REESEES(new SnackItem.Builder("Reesees")
			.setName("Reesees")
			.setLocation("C4")
			.setPrice(3 * CoinType.ONEDOLLAR.getValue() + 2 * CoinType.TWENTYCENTS.getValue())
			.setAmount(5)
			.build()),
	
	HERSHEYS(new SnackItem.Builder("Hersheys")
			.setName("Hersheys")
			.setLocation("C5")
			.setPrice(3 * NotesType.FIFTYDOLLARS.getValue())
			.setAmount(5)
			.build()),
	
	// ROW D
	MENTOS(new SnackItem.Builder("Mentos")
			.setName("Mentos")
			.setLocation("D1")
			.setPrice(3 * CoinType.TENCENTS.getValue())
			.setAmount(5)
			.build()),
	ORBIT(new SnackItem.Builder("Orbit")
			.setName("Orbit")
			.setLocation("D2")
			.setPrice(CoinType.TWENTYCENTS.getValue())
			.setAmount(5)
			.build()),
	TICTAC(new SnackItem.Builder("Tictac")
			.setName("Tictac")
			.setLocation("D3")
			.setPrice(CoinType.TENCENTS.getValue() + 3 * CoinType.ONEDOLLAR.getValue())
			.setAmount(5)
			.build()),	
	SANITIZER(new SnackItem.Builder("Sanitizer")
			.setName("Sanitizer")
			.setLocation("D4")
			.setPrice(NotesType.TWENTYDOLLARS.getValue())
			.setAmount(5)
			.build());
	
	private SnackItem snack;

	
	private SnackType(SnackItem snack) {
		this.snack = snack;
	}


	public SnackItem getSnack() {
		return snack;
	}


	public void setSnack(SnackItem snack) {
		this.snack = snack;
	}

}
