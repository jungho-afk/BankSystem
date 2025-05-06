public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String ownerName, double balance, double overdraftLimit) {
        super(accountNumber, ownerName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if (amount > balance + overdraftLimit) {
            throw new Exception("인출 한도 초과!");
        }
        balance -= amount;
    }

    @Override
    public void printAccountInfo() {
        System.out.println("체킹 계좌 - " + accountNumber + " / " + ownerName + " / 잔액: " + balance);
    }
}