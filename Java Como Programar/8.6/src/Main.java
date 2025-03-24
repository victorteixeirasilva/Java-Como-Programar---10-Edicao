public class Main {
    public static void main(String[] args) {
        SavingsAccount.modifyInterestRate(4);
        SavingsAccount saver1 = new SavingsAccount();
        saver1.setSavingsBalance(2000);

        SavingsAccount saver2 = new SavingsAccount();
        saver2.setSavingsBalance(3000);

        System.out.println(saver1.getSavingsBalance());
        System.out.println(saver1.calculateMonthlyInterest());
        System.out.println(saver1.getSavingsBalance());

        System.out.println(saver2.getSavingsBalance());
        System.out.println(saver2.calculateMonthlyInterest());
        System.out.println(saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(5);
        System.out.println(saver1.getSavingsBalance());
        System.out.println(saver1.calculateMonthlyInterest());
        System.out.println(saver1.getSavingsBalance());

        System.out.println(saver2.getSavingsBalance());
        System.out.println(saver2.calculateMonthlyInterest());
        System.out.println(saver2.getSavingsBalance());

    }
}