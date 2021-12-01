public class TestBankAccount{
    
    public static void main(String[] args) {
        
        // ---- Create Bank Accounts-----
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();
        BankAccount account4 = new BankAccount();
        
        // ---- Deposit into Checking Accounts-----
        account1.checkingDeposit(350.00);
        account2.checkingDeposit(250.00);
        account3.checkingDeposit(550.00);
        account4.checkingDeposit(50.00);
        // ------Print Checking Balances---and total after checking Deposits------
        System.out.println("Account 1 has $" + account1.getCheckingBalance() + " in their checking account.");
        System.out.println("Account 2 has $" + account2.getCheckingBalance() + " in their checking account.");
        System.out.println("Account 3 has $" + account3.getCheckingBalance() + " in their checking account.");
        System.out.println("Account 4 has $" + account4.getCheckingBalance() + " in their checking account.");
        System.out.println("The Bank has $" + BankAccount.getTotalAmountStored() + " after all the checking deposits" + "\n");



        // ---- Deposit into Savings Accounts-----
        account1.savingsDeposit(10000.00);
        account2.savingsDeposit(3000.00);
        account3.savingsDeposit(200.00);
        account4.savingsDeposit(7900.00);
        // ------Print Savings Balances-----and total after savings Deposits ----
        System.out.println("Account 1 has $" + account1.getSavingsBalance() + " in their savings account.");
        System.out.println("Account 2 has $" + account2.getSavingsBalance() + " in their savings account.");
        System.out.println("Account 3 has $" + account3.getSavingsBalance() + " in their savings account.");
        System.out.println("Account 4 has $" + account4.getSavingsBalance() + " in their savings account.");
        System.out.println("The Bank has $" + BankAccount.getTotalAmountStored() + " after all the checking and savings deposits" + "\n");


        // --------------withdraw Test-----------
        account1.checkingWithdraw(500.00);
        account2.checkingWithdraw(20.00);
        account3.checkingWithdraw(100.00);
        account4.checkingWithdraw(50.00);
        
        account1.savingsWithdraw(1500.00);
        account2.savingsWithdraw(3520.00);
        account3.savingsWithdraw(100.00);
        account4.savingsWithdraw(2250.00);

        // --------------print AccountBalance----------
        System.out.println("Account 1 has $" + account1.getCheckingBalance() + " in their checking account after withdrawing.");
        System.out.println("Account 2 has $" + account2.getCheckingBalance() + " in their checking account after withdrawing.");
        System.out.println("Account 3 has $" + account3.getCheckingBalance() + " in their checking account after withdrawing.");
        System.out.println("Account 4 has $" + account4.getCheckingBalance() + " in their checking account after withdrawing.");

        System.out.println("Account 1 has $" + account1.getSavingsBalance() + " in their savings account after withdrawing.");
        System.out.println("Account 2 has $" + account2.getSavingsBalance() + " in their savings account after withdrawing.");
        System.out.println("Account 3 has $" + account3.getSavingsBalance() + " in their savings account after withdrawing.");
        System.out.println("Account 4 has $" + account4.getSavingsBalance() + " in their savings account after withdrawing.");
        
        
// ----------------final Totals and number of accounts-------------
        System.out.println("The Bank has $" + BankAccount.getTotalAmountStored() + "After today's transactions.");
        System.out.println("There are a total of " + BankAccount.getNumberOfAccounts() + " Bank Accounts");



        
    }
}