package Bank;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(String bankName, String owner, int balance){
        super(bankName, owner, balance,"Checking");
    }
}
