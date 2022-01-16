public class Account {
    private static int numAccounts;

    public static int getNumAccounts() {
        return numAccounts;
    }

    public static void setNumAccounts(int numAccounts) {
        Account.numAccounts = numAccounts;
    }

    private int id;
    private double currBalance;
    private int custID;

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = Account.numAccounts;
        numAccounts++;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getCurrBalance() {
        return currBalance;
    }

    public void setCurrBalance(double currBalance) {
        this.currBalance = currBalance;
    }

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }
}
