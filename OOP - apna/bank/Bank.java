package bank;

class Account {
    public String name;
    protected String email;
    private String password;

    // getters & setters
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.name = "Sanmit Suthar";
        acc1.setPassword("thisispassword");
        acc1.getPassword();
        System.out.println(acc1.getPassword());

    }

    public void printSomething() {
        System.out.println("This method prints something");
    }
}
