public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account sa = new SavingsAccount("1111", "홍길동", 10000, 0.02);
        Account ca = new CheckingAccount("2222", "이순신", 5000, 2000);

        bank.addAccount(sa);
        bank.addAccount(ca);

        try {
            bank.findAccount("1111").deposit(5000);
            bank.findAccount("2222").withdraw(2000);
            bank.transfer("1111", "2222", 3000);
        } catch (Exception e) {
            System.out.println("에러: " + e.getMessage());
        }

        sa.printAccountInfo();
        ca.printAccountInfo();
    }
}