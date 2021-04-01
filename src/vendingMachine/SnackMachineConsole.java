package vendingMachine;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Scanner;

import money.CardType;
import snacks.SnackItem;
import snacks.SnackType;

public class SnackMachineConsole implements SnackMachine{
	private static double balance=0.0;
	private ArrayList<SnackItem> soldSnacks = new ArrayList<SnackItem>();
	private static  EnumSet<SnackType> stockSnacks;

	public void DisplayMenu()
	{
		stockSnacks = createSnacks();

		Scanner userOption = new Scanner(System.in);

		while(true) {

			System.out.println("       $$$$$   HELLO   $$$$$");
			System.out.println();
			System.out.println("            MAIN MENU");
			System.out.println("PRESS 1 TO DISPLAY SNACKS AVAILABLE");
			System.out.println("PRESS 2 CHECK MACHINE BALANCE");
			System.out.println("PRESS 3 CHECK SOLD SNACKS");
			System.out.println("PRESS 4 CHECK HOW MANY SNACKS LEFT");
			System.out.println("PRESS 5 TO QUIT");
			System.out.println();
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

			String inputOption = userOption.nextLine();
			//userOption.close();

			switch(inputOption) {
			case "1":
				System.out.println("AVAILABLE SNACKS: ");
				DisplaySnacks(stockSnacks);
				break;

			case "2":
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				System.out.println("\nMACHINE BALANCE: " + balance() + " $\n");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				break;

			case "3":
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				System.out.println("\nSOLD SNACKS");
				vendedSnacks();
				break;
			case "4":
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
				isSoldOut(stockSnacks);
			case "5":
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				System.out.println("\nTHANK YOU! HAVE A NICE DAY! :)\n\n");
				break;
			default:
				System.out.println("INVALID OPTION :( TRY AGAIN");
				System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				break;

			}
		}
	}

	public void DisplaySnacks(EnumSet<SnackType> stockSnacks){
		
		Iterator<SnackType> iterator = stockSnacks.iterator();
		System.out.println(" ================");
		while(iterator.hasNext()) {
			SnackType snack = iterator.next();
			System.out.format("%-3s%-14s|\n", "|", snack.getSnack().getName());
			System.out.format("%-3s%-14s|\n", "|", snack.getSnack().getLocation());
			System.out.format("%-3s%-14f|\n", "|", snack.getSnack().getPrice());
			System.out.format("%-3s%-14d|\n", "|", snack.getSnack().getAmount());
			System.out.println(" ================");
		}
		Scanner userSelection = new Scanner(System.in);
		System.out.println("PLEASE ENTER LOCATION OF THE DESIRED SNACK. TO RETURN BACK PRESS B");
		String inputSelection = userSelection.nextLine();

		switch(inputSelection.toUpperCase()) {
		// ROW A
		case "A1":
			if(SnackType.LAYS.getSnack().isAvailable()) {
				System.out.println(SnackType.LAYS.getSnack().getName() +" is AVAILABLE, PRICE: "+ SnackType.LAYS.getSnack().getPrice());
				moneyDeposit(SnackType.LAYS.getSnack());
			}
			else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				break;
			}
			break;
		case "A2":
			if(SnackType.CHEETOS.getSnack().isAvailable()) {
				System.out.println(SnackType.CHEETOS.getSnack().getName() +" is AVAILABLE, PRICE: "+ SnackType.CHEETOS.getSnack().getPrice());
				moneyDeposit(SnackType.CHEETOS.getSnack());

			}
			else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			}
			break;
		case "A3":
			if(SnackType.PRINGLES.getSnack().isAvailable()) {
				System.out.println(SnackType.PRINGLES.getSnack().getName() +" is AVAILABLE, PRICE: "+ SnackType.PRINGLES.getSnack().getPrice());
				moneyDeposit(SnackType.PRINGLES.getSnack());
			}
			else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			}
			break;
		case "A4":
			System.out.println("EMPTY STOCK");
			System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			break;
		case "A5":
			System.out.println("EMPTY STOCK");
			System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			break;

			// ROW B
		case "B1":
			if(SnackType.COKE.getSnack().isAvailable()) {
				System.out.println(SnackType.COKE.getSnack().getName() +" is AVAILABLE, PRICE: "+ SnackType.COKE.getSnack().getPrice());
				moneyDeposit(SnackType.COKE.getSnack());

			}
			else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			}
			break;

		case "B2":
			if(SnackType.WATER.getSnack().isAvailable()) {
				System.out.println(SnackType.WATER.getSnack().getName() +" is AVAILABLE, PRICE: "+ SnackType.WATER.getSnack().getPrice());
				moneyDeposit(SnackType.WATER.getSnack());

			}
			else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			}
			break;

		case "B3":
			if(SnackType.PEPSI.getSnack().isAvailable()) {
				System.out.println(SnackType.PEPSI.getSnack().getName() +" is AVAILABLE, PRICE: "+ SnackType.PEPSI.getSnack().getPrice());
				moneyDeposit(SnackType.PEPSI.getSnack());

			}
			else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			}
			break;
		case "B4":
			System.out.println("EMPTY STOCK");
			System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			break;

		case "B5":
			System.out.println("EMPTY STOCK");
			System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			break;

			// ROW C
		case "C1":
			if(SnackType.TWIX.getSnack().isAvailable()) {
				System.out.println(SnackType.TWIX.getSnack().getName() +" is AVAILABLE, PRICE: "+ SnackType.TWIX.getSnack().getPrice());
				moneyDeposit(SnackType.TWIX.getSnack());
			}
			else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			}
			break;
		case "C2":
			if(SnackType.SNICKERS.getSnack().isAvailable()) {
				System.out.println(SnackType.SNICKERS.getSnack().getName() +" is AVAILABLE, PRICE: "+ SnackType.SNICKERS.getSnack().getPrice());
				moneyDeposit(SnackType.SNICKERS.getSnack());
			}	
			else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			}
			break;
		case "C3":
			if(SnackType.MNMS.getSnack().isAvailable()) {
				System.out.println(SnackType.MNMS.getSnack().getName() +" is AVAILABLE, PRICE: "+ SnackType.MNMS.getSnack().getPrice());
				moneyDeposit(SnackType.MNMS.getSnack());

			}
			else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			}
			break;

		case "C4":
			if(SnackType.REESEES.getSnack().isAvailable()) {
				System.out.println(SnackType.REESEES.getSnack().getName() +" is AVAILABLE, PRICE: "+ SnackType.REESEES.getSnack().getPrice());
				moneyDeposit(SnackType.REESEES.getSnack());

			}
			else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			}
			break;

		case "C5":
			if(SnackType.HERSHEYS.getSnack().isAvailable()) {
				System.out.println(SnackType.HERSHEYS.getSnack().getName() +" is AVAILABLE, PRICE: "+ SnackType.HERSHEYS.getSnack().getPrice());
				moneyDeposit(SnackType.HERSHEYS.getSnack());

			}
			else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			}
			break;

			// ROW D
		case "D1":
			if(SnackType.MENTOS.getSnack().isAvailable()) {
				System.out.println(SnackType.MENTOS.getSnack().getName() +" is AVAILABLE, PRICE: "+ SnackType.MENTOS.getSnack().getPrice());
				moneyDeposit(SnackType.MENTOS.getSnack());

			}
			else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			}
			break;

		case "D2":
			if(SnackType.ORBIT.getSnack().isAvailable()) {
				System.out.println(SnackType.ORBIT.getSnack().getName() +" is AVAILABLE, PRICE: "+ SnackType.ORBIT.getSnack().getPrice());
				moneyDeposit(SnackType.ORBIT.getSnack());

			}
			else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			}
			break;

		case "D3":
			if(SnackType.TICTAC.getSnack().isAvailable()) {
				System.out.println(SnackType.TICTAC.getSnack().getName() +" is AVAILABLE, PRICE: "+ SnackType.TICTAC.getSnack().getPrice());
				moneyDeposit(SnackType.TICTAC.getSnack());

			}
			else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			}
			break;

		case "D4":
			if(SnackType.SANITIZER.getSnack().isAvailable()) {
				System.out.println(SnackType.SANITIZER.getSnack().getName() +" is AVAILABLE, PRICE: "+ SnackType.SANITIZER.getSnack().getPrice());
				moneyDeposit(SnackType.SANITIZER.getSnack());

			}
			else {
				System.out.println("NOT AVAILABLE.");
				System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			}
			break;

		case "D5":
			System.out.println("EMPTY STOCK");
			System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			break;

			// QUIT
		case "B":
			DisplayMenu();
			break;
			// others
		default:
			System.out.println("INVALID LOCATION :( TRY AGAIN");
			System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			break;
		}

	}

	public void moneyDeposit(SnackItem item) {
		Scanner userPayMethod = new Scanner(System.in);
		Scanner userMoney = new Scanner(System.in);
		Scanner userCardNumber = new Scanner(System.in);
		double inputMoney=0.0;
		System.out.println("       $$$$$   PAYMENT METHOD   $$$$$");
		System.out.println();
		System.out.println("PRESS 1 TO PAY IN COINS");
		System.out.println("PRESS 2 TO PAY WITH CARD");
		System.out.println("PRESS 3 TO PAY WITH NOTES");
		System.out.println("PRESS 4 TO CANCEL PURCHASE");
		System.out.println();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println();

		int inputPayMethod = userPayMethod.nextInt();

		switch(inputPayMethod) {
		case 1:
			System.out.println("ENTER COINS AMOUNT [DOMINATIONS 10c • 20c • 50c • $1 ]");
			inputMoney = userMoney.nextDouble();
			if(inputMoney - item.getPrice() >= 0) {
				if(item.getAmount() >= 1) {
					System.out.println("MONEY ACCEPTED.");
					System.out.println("SUCCESSFULLY PURCHASED " + item.getName());
					System.out.println("CALCULATING CHANGE: " + Math.round((inputMoney - item.getPrice())* 100.0)/ 100.0);
					item.reduceAmount(1);
					soldSnacks.add(item);
					calculateBalance(item.getPrice());
					System.out.println( item.getName() +  " REMAINING: " + item.getAmount());
					System.out.println("\nTHANK YOU! HAVE A NICE DAY! :)\n\n");
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				}
			}
			else {
				System.out.println("OOPS... NOT ENOUGH MONEY .. REDIRECTING TO MAIN MENU\n");
			}
			break;


		case 2:
			System.out.println("ENTER VALID CARD NUMBER");
			String inputCardNumber = userCardNumber.nextLine();
			System.out.println("VALIDATING CARD...");
			CardType card = CardType.detect(inputCardNumber);
			if(card.equals(CardType.UNKNOWN)) {
				System.out.println("UNKNOWN CARD TYPE... REDIRECTING TO PAYMENT MENU");
				moneyDeposit(item);
			}
			else {
				System.out.println("VALID " + card + " CARD. PRECEED...");
				System.out.println("ENTER MONEY AMOUNT TO WITHDRAW FROM CARD");
				inputMoney = userMoney.nextDouble();
				if(inputMoney - item.getPrice() >= 0) {
					if(item.getAmount() >= 1) {
						System.out.println("MONEY ACCEPTED.");
						System.out.println("SUCCESSFULLY PURCHASED " + item.getName());
						System.out.println("CALCULATING CHANGE: " + Math.round((inputMoney - item.getPrice())* 100.0)/ 100.0);
						item.reduceAmount(1);
						soldSnacks.add(item);
						calculateBalance(item.getPrice());
						System.out.println( item.getName() +  " REMAINING: " + item.getAmount());
						System.out.println("\nTHANK YOU! HAVE A NICE DAY! :)\n\n");
						System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					}
				}
				else {
					System.out.println("OOPS... NOT ENOUGH MONEY .. REDIRECTING TO MAIN MENU\n");
				}
				break;
			}

		case 3:
			System.out.println("ENTER NOTES AMOUNT [ONLY ACCEPTS 20$ and 50$ ]");
			inputMoney = userMoney.nextDouble();
			if(inputMoney - item.getPrice() >= 0 && (inputMoney == 50 || inputMoney == 20)) {
				if(item.getAmount() >= 1) {
					System.out.println("MONEY ACCEPTED.");
					System.out.println("SUCCESSFULLY PURCHASED " + item.getName());
					System.out.println("CALCULATING CHANGE: " + Math.round((inputMoney - item.getPrice())* 100.0)/ 100.0);
					item.reduceAmount(1);
					soldSnacks.add(item);
					calculateBalance(item.getPrice());
					System.out.println( item.getName() +  " REMAINING: " + item.getAmount());
					System.out.println("\nTHANK YOU! HAVE A NICE DAY! :)\n\n");
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				}
			}
			else {
				System.out.println("OOPS... NOT ENOUGH MONEY .. REDIRECTING TO MAIN MENU\n");
			}
			break;

		case 4:
			DisplayMenu();
		default:
			System.out.println("INVALID INPUT");
		}

	}

	public void calculateBalance(double price) {
		setBalance(getBalance() + price);
	}
	
	public static EnumSet<SnackType> createSnacks() {
		 stockSnacks = EnumSet.allOf(SnackType.class);
		 return stockSnacks;
	}
	@Override
	public void isSoldOut(EnumSet<SnackType> remainedSnacks) {
		Iterator<SnackType> iterator = remainedSnacks.iterator();
		int remaining =0;
		if(!iterator.hasNext())
			System.out.println("ALL SNAKCS ARE SOLD!");
		else {
			while (iterator.hasNext()) {
				remaining += iterator.next().getSnack().getAmount();
			}
			System.out.println("THERE ARE " + remaining + " SNACKS LEFT");
		}
		System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

	}

	@Override
	public double balance() {
		return getBalance();
	}

	@Override
	public void vendedSnacks() {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		if(soldSnacks.size() > 0) {
			for ( SnackItem item : soldSnacks) {
				System.out.println("\nname: " + item.getName() + " , in location: "+ item.getLocation() + " , and price: " + item.getPrice() + " was sold.");
			}
		}
		else
			System.out.println("\nNO SNACK SOLD YET.");
		System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}

	public static double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
