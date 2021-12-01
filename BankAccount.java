import java.util.ArrayList;
import java.util.Random;
public class BankAccount{

    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts = 0; 
    private static double totalAmountStored = 0;
    // ---------random Accountnumbers---------
    // private String accountNumber;

    public BankAccount(){
        numberOfAccounts += 1;
        // accountNumber = createAccountNumber();
    }

    // -----Methods-------
    // ---------random account generator method--------
    // Random rand = new Random();

    // private ArrayList<Integer> createAccountNumber(){
    //     int upperbound = 2000;
    //     ArrayList<Integer> randomAccountNumbers = new ArrayList<Integer>();
    //     String string = String.join(randomAccountNumbers);
    //     for(int i=0; i<10; i++){
    //         int number = rand.nextInt(upperbound);
    //         randomAccountNumbers.add(number);
    //     }return string;


    // }

    // -----------SETTERS-------------
    
    public void checkingDeposit(double sum){
        this.checkingBalance += sum;
        this.totalAmountStored += sum;
    }
    public void savingsDeposit(double sum){
        this.savingsBalance += sum;
        this.totalAmountStored += sum;
    }
    public void checkingWithdraw(double sum){
        if(this.checkingBalance < sum){
            System.out.println("Sorry Insufficient Funds!");
        }else{
            this.checkingBalance -= sum;
            this.totalAmountStored -= sum;
        }
    }
    public void savingsWithdraw(double sum){
        if(this.savingsBalance < sum){
            System.out.println("Sorry Insufficient Funds!");
        }else{
            this.savingsBalance -= sum;
            this.totalAmountStored -= sum;
        }
    }
    
    
    
    // -----------STATIC GETTERS-------------
    
    public static double getTotalAmountStored(){
        return totalAmountStored;
    }
    public static int getNumberOfAccounts(){
        return numberOfAccounts;
    }
    
    // -----------GETTERS-------------
    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    public double getSavingsBalance(){
        return this.savingsBalance;
    }


}