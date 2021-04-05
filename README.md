# SnackMachine

Specifications of the Snack Machine 

## Money Slots: the machine accepts money of the following types:
  #### CoinSlot: There are four denominations: • 10c • 20c • 50c • $1 
  #### CardSlot : all cards accepted
  #### Notes Slot :20$ and 50$ only
  #### Machine only accepts USD currency
  
## Snack Slots
  #### The machine has five rows to display snack items.
  #### Each row has 5 columns to pile the items.
  #### Each column has a number.
  
## Keypad
  #### Users can select the items to be purchased using a keypad.


# Purchase a Snack Use Case

## Basic Flow
1.	This use case begins when the customer wants to purchase snacks.
2.	The customer selects a number by pressing on the keypad. 
3.	The VM displays a message that the snack is available for the selected number and displays its price.
4.	The customer inserts the money.
5.	The VM validates the money.
6.	The VM accepts the money. 
7.	The VM displays the accumulated amount of money each time a new money is entered.
8.	The VM monitors the amount of the accepted money, If the money is enough, the VM dispenses the selected snack to the customer. 
9.	The VM determines if any change should be sent back to customer.
10.	The VM displays the change at panel. 
11.	Then, the VM dispenses change.

