package Bank;

public class SavingsAccount extends BankAccount{
    private int interest;

    public SavingsAccount(String bankName, String owner, int balance, int interest ){
        super(bankName, owner, balance," Savings");
        this.interest = interest;
    }

    public void applyInterest() {balance += balance * ((float) interest /100); }
}
