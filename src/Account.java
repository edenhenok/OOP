public class Account {

    public long accntnum;
    public int balance;
    public String name;
    public String email;
    public long phone;

    //Constructor- you can have multiple with different number of fields
    public Account(){
        System.out.println("cons");
    }
    public Account(long accntnum, double balance, String name, String email, String phone){
        setAccntnum(accntnum);
    }

    public void setAccntnum(long accntnum){
        this.accntnum=accntnum;
    }
    public long getAccntnum(){
        return this.accntnum;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void deposit(int add){
        this.balance= balance+add; //this.balance+=add
        System.out.println("Final balance is"+this.balance);
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
    public int getBalance(){
        return this.balance;
    }
    public void withdraw(int sub){
        if(this.balance>0) {
            this.balance = balance - sub;
        }
        else
            System.out.println("Insuffic");

    }


}
