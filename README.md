# 5.9.1 Bank Account
- Create a class called BankAccount in BankAccount.java that keeps track of the account holder’s `name`, the account number (`accountNum`), and the `balance` in the account. Make sure you use the appropriate data types for these.
- Write 2 constructors for the class that initialize the instance variables to default values and to given parameters. For the parameters, use the same variable names as your instance variables. Use the `this` keyword to distinguish between the instance variables and the parameter variables.
- Write a toString() method for the class. Use the `this` keyword to return the instance variables.
- Write a `withdraw(amount)` and `deposit(amount)` for the class. Withdraw should subtract the amount from the balance as long as there is enough money in the account (the balance is larger than the amount). Deposit should add the amount to the balance. Use the `this` keyword to refer to the balance.

Test your class with a main method in the Main.java file that creates a Bank Account object and calls its deposit and withdraw methods and prints out the object to test its toString() method.