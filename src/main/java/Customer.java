public class Customer {
    private static int numCustomers;
    private static final String DefaultUsername = "DEFAULT_USER";
    private static final String DefaultPassword = "PASSWORD";
    private static final String DefaultName = "DEFAULT_NAME";

    public static int getNumCustomers() {
        return numCustomers;
    }

    public static void setNumCustomers(int numCustomers) {
        Customer.numCustomers = numCustomers;
    }

    private int id;
    private String username;
    private String password;
    private String name;

    //Default constructor
    public Customer() {
        this.setId();
        this.setUsername(Customer.DefaultUsername);
        this.setPassword(Customer.DefaultPassword);
        this.setName(Customer.DefaultName);
    }

    //Constructor with name parameter
    public Customer(String tName) {
        this.setId();
        this.setUsername(Customer.DefaultUsername);
        this.setPassword(Customer.DefaultPassword);
        this.setName(tName);
    }

    //Constructor with name, username and password parameters
    public Customer(String tName, String tUsername, String tPassword) {
        this.setId();
        this.setUsername(tUsername);
        this.setPassword(tPassword);
        this.setName(tName);
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = Customer.getNumCustomers();
        numCustomers++;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String ToString() {
        return this.name;
    }
}
