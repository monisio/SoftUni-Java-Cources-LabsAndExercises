package JavaAdvancedCourse.DefiningClasses.E01BankAccount;

public class BankAccount {

    private final static double DEFAULT_INTEREST_RATE = 0.02;
    private static double interestRate = DEFAULT_INTEREST_RATE;
    private static int bankAccountCount = 1;
    private int id;
    private double balance;


    public BankAccount() {
        this.id = bankAccountCount++;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public static void resetInterestRateDefault() {
        interestRate = DEFAULT_INTEREST_RATE;
    }

    public double getInterest(int years){
        return interestRate * this.balance * years ;
    }

    public int getId(){
        return this.id;
    }

    public void deposit (double amount){
        this.balance+= amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
    }
}
