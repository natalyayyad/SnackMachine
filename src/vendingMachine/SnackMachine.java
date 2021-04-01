package vendingMachine;

import java.util.EnumSet;

import snacks.SnackType;

public interface SnackMachine {
	
	public void isSoldOut(EnumSet<SnackType> remainedSnacks);
	public double balance();
	public void vendedSnacks();

}
