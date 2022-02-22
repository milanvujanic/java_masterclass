package accessmodifiers;

public class Test {
    public static void main(String[] args) {
        Account milansAccount = new Account("Milan");
        milansAccount.deposit(100);
        milansAccount.withdraw(30);
        milansAccount.withdraw(-9);
        milansAccount.deposit(-6);
        milansAccount.calculateBalance();

        System.out.println("The balance is: " + milansAccount.getBalance());
        milansAccount.calculateBalance();
    }
}
