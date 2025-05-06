public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, String ownerName, double balance, double interestRate) {
        super(accountNumber, ownerName, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        balance += balance * interestRate;
    }

    @Override
    public void printAccountInfo() {
        System.out.println("저축 계좌 - " + accountNumber + " / " + ownerName + " / 잔액: " + balance);
    }
}