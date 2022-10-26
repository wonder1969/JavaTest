package HomeWork.Homework5;

public class BankAccount {
    int schet;

    int popolnenieScheta(int plus){
        schet+=plus;
        return schet;
    }

    int snyatieSoScheta(int minus){
        schet-=minus;
        return schet;
    }

    void ShowInfo(){
        System.out.println("Summa na BankAccount: " + schet);
    }
}

class BankAccontTest{
    public static void main(String[] args){
        BankAccount Account = new BankAccount();
        Account.schet = 1542;
        Account.ShowInfo();
        Account.popolnenieScheta(5231);
        Account.ShowInfo();
        Account.snyatieSoScheta(4212);
        Account.ShowInfo();
    }
}
