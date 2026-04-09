class atm {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
public class Mn {
    public static void main(String[] args) {
        atm a = new atm();
        a.setBalance(1000.000);  
        System.out.println(a.getBalance());
    }
}