public class Account {
  private double balance;

  Account(double init_balance) {
    this.balance = init_balance;
  }

  public double getBalance() {
    return balance;
  }

  public void deposit(double amt) {
    this.balance += amt;
  }

  public void withdraw(double amt) {
    if (amt > this.balance) {
      System.out.println("you have only $" + this.getBalance());
    } else {
      this.balance -= amt;
      System.out.println("取款成功");
    }
  }
}

class Customer {
  String firstName;
  String lastName;
  Account account;

  public Customer(String s, String l) {
    this.firstName = s;
    this.lastName = l;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }
}

class Bank {
  Customer[] customers;
  int numberOfCustomer;

  public Bank() {
    this.customers = new Customer[20];
  }

  public int getNumberOfCustomer() {
    return numberOfCustomer;
  }

  public Customer getCustomers(int index) {
    if (index >= this.numberOfCustomer || index < 0) {
      System.out.println("error");
      return null;
    }
    return customers[index];
  }

  public void addCustomer(String f, String l) {
    this.customers[this.numberOfCustomer] = new Customer(f, l);
    this.numberOfCustomer++;
  }
}

class BankTest {
  public static void main(String[] args) {
    Bank bank = new Bank();
    bank.addCustomer("li", "heng");
  }
}