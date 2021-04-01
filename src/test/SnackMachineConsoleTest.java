package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vendingMachine.SnackMachineConsole;



class SnackMachineConsoleTest {
	
	@Test
	void initialBalance_isZero() {
		assertEquals(0.0, SnackMachineConsole.getBalance());
	}
	
	@Test
    void newSnackMachine_should_have_15_types_of_snacks() {
		assertEquals(15, SnackMachineConsole.createSnacks().size());
    }
	
}
