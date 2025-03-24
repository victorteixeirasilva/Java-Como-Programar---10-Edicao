public class SavingsAccount {

    static double annualInterestRate;
    private double savingsBalance;

    public double calculateMonthlyInterest(){
        double calculateMonthlyInterest = (savingsBalance*annualInterestRate)/12;
        savingsBalance += calculateMonthlyInterest;
        return calculateMonthlyInterest;
    }

    public static void modifyInterestRate(double value){
        annualInterestRate = value;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
}
