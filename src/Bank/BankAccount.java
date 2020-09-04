package Bank;

public class BankAccount {
    private String bankName;
    private String owner;
    protected int balance;
    private String type;

public BankAccount(String bankName, String owner, int balance, String type){
    this.bankName = bankName;
    this.owner = owner;
    this.balance = balance;
    this.type = type;
}

public void deposit(int amt){
balance += amt;
}

public void withdrawal(int amt){
if (balance >= amt){
    balance -= amt;
}
}

public String getBankInfo(){
return "Bank Name: "+ bankName + "\nOwner: "+ owner + "\nCurrent Balance: $" + balance + "\nType: "+ type;
}
}

