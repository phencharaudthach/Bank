package Bank;

public class CreditAccount extends BankAccount{
    private int creditAmt;

    public CreditAccount(String bankName, String owner, int balance, int creditAmt){
        super(bankName, owner, balance, "CreditAccount");
        this.creditAmt = creditAmt;
    }



}
