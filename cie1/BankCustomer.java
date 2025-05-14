
public class BankCustomer {
   
    private String customerName;
    private String accountNumber;
    private int age;

    
    public BankCustomer(String customerName, String accountNumber, int age) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.age = age;
    }

    
    public void displayCustomerName() {
        System.out.println("Customer Name: " + customerName);
    }

    
    public void displayAccountNumber() {
        System.out.println("Account Number: " + accountNumber);
    }

   
    public void displayCustomerAge() {
        System.out.println("Customer Age: " + age);
    }

  
    public static void main(String[] args) {
      
        BankCustomer customer = new BankCustomer("Alice Smith", "1234567890", 30);
        customer.displayCustomerName();
        customer.displayAccountNumber();
        customer.displayCustomerAge();
    }
}
