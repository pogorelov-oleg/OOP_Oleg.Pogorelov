package Services;

public class CoinDispenser {
  private int balance;

  public CoinDispenser(){
    this.balance = 0;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String toString() {
    return "Баланс: " + balance + " рублей";
  }
}