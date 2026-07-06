# ATM Banking System

## Objective
The project ATM Banking System is like a ATM machine where we check the balance, deposit or withdraw the amount. 

## COncepts Used
Functions are used in this program. A function is block of code which is reusable and executes a specified task when it is called.

## Project Flow
1. displayMenu() function is responsible to print the menu options to the user.
2. User enters their choice.
3. According to the choice of the user if it is "1" then checkBalance function executes, 
    if "2" then depositMoney function exuectes,
    if "3" then withdrawMoney function executes,
    if "4" then exitProgram function is executed.
4. After performing the choice of the user, the program again displays the menu so that user can choose a option one more time.
5. If the user choice is 4 or greater than 4 then the program ends.

checkBalance() this function prints the amount in the bacnk.
depositMoney() this function takes input amount from the user and adds the amount to the balance and returns the balance. If there the amount is less than or equal to 0 the program handles it as a invalid input.
withdrawMoney() this function takes input amount from the user and subtracts the amount from the balance and returns the balance. If there the amount is less than or equal to 0 the program handles it as a invalid input.
exitProgram() this handles the last message from the ATM that is Thank you.

## Test Cases

### TestCase1:

## Ouput
=======ATM=======
1.Check Balance
2.Deposit Money
3.Withdraw Money
4.Exit
Enter your choice:
1
Current Balance: 10000
=======ATM=======
1.Check Balance
2.Deposit Money
3.Withdraw Money
4.Exit
Enter your choice:
2
Enter amount to deposit: 
2500
Amount deposited successfully
=======ATM=======
1.Check Balance
2.Deposit Money
3.Withdraw Money
4.Exit
Enter your choice:
1
Current Balance: 12500
=======ATM=======
1.Check Balance
2.Deposit Money
3.Withdraw Money
4.Exit
Enter your choice:
3   
Enter withdrawal amount: 
5000
Withdrawal Successful
=======ATM=======
1.Check Balance
2.Deposit Money
3.Withdraw Money
4.Exit
Enter your choice:
1
Current Balance: 7500
=======ATM=======
1.Check Balance
2.Deposit Money
3.Withdraw Money
4.Exit
Enter your choice:
3   
Enter withdrawal amount: 
7600
Withdrawal amount should be less than or equal to balance
=======ATM=======
1.Check Balance
2.Deposit Money
3.Withdraw Money
4.Exit
Enter your choice:
4
Thank you for using our ATM