package ArrayList;

import java.util.*;
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(){
        super("Error on Funds");
    }
}

class BankAccount {
    String accountNumber=new String();
    double balance;
    public BankAccount(String str,double bal){
        this.accountNumber=str;
        this.balance=bal;
    }
    public double getBal(){
        return balance;
    } 
    public void setBal(double amt){
        balance=amt;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter account number,Balance and fund to be withdrawn");
        String str1=scan.next();
        double bala=scan.nextDouble();
        double amout=scan.nextDouble();
        BankAccount ba=new BankAccount(str1,bala);
        try{
            Withdraw(amout,ba);
        }catch (InsufficientFundsException e){
            System.out.println("Error: Insufficient Funds. Current Balance: "+ba.getBal());
        }
    }
    public static void Withdraw(double a,BankAccount ac) throws InsufficientFundsException{
        double c=ac.getBal();
        if(a<=c){
            double b=c-a;
            ac.setBal(b);
            System.out.println("Withdrawal successful. Remaining Balance: "+ac.getBal());
        }
        else{
            throw new InsufficientFundsException();
        }
    }
}
