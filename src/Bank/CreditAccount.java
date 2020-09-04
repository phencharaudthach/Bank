package Bank;

public class CreditAccount extends BankAccount{
    private int creditLimit;
    private int minimumPayment;


    public CreditAccount(String bankName, String owner, int balance, int creditLimit, int minimumPayment){
        super(bankName, owner, balance - minimumPayment, "CreditAccount");
        this.creditLimit = creditLimit;
        this.minimumPayment = minimumPayment;
    }

    public void creditUsed(int amt){
        creditLimit -= amt;
    }

    public void payCredit(){
       creditLimit =+ minimumPayment;
//        System.out.println(creditLimit);
    }
}
