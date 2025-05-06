import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account findAccount(String accountNumber) throws Exception {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) return acc;
        }
        throw new Exception("계좌를 찾을 수 없습니다.");
    }

    public void transfer(String fromAcc, String toAcc, double amount) throws Exception {
        Account from = findAccount(fromAcc);
        Account to = findAccount(toAcc);

        from.withdraw(amount);
        to.deposit(amount);
    }
}