import java.util.*;

public class MainImplementation {

    public static void startMenu() {
        Scanner UserIn = new Scanner(System.in);
        boolean menuRunning = true;
        String InputString;

        while (menuRunning) {
            System.out.println("Welcome to Gardner Bank. Please enter option: " +
                    "\n(1) To log in with existing user account" +
                    "\n(2) To register a new user account" +
                    "\n(0) To exit");
            InputString = UserIn.nextLine();

            switch(InputString) {
                case "0":
                    menuRunning = false;
                    break;
                case "1":
                    //Add login menu
                    break;
                case "2":
                    //Add registration menu
                    break;
                default:
                    System.out.println("Invalid entry. Please enter 0-2.");
            }
        }

        UserIn.close();
    }

    public static void loginMenu() {
        Scanner UserIn = new Scanner(System.in);
        boolean menuRunning = true;
        String InputString;

        while (menuRunning) {
            System.out.println("Please enter your username: ");
            InputString = UserIn.nextLine();

            //Check InputString against list of users to see if username exists
        }
    }

    public static void main(String[] args) {
        Customer TestCustomerOne = new Customer("Brian G", "bgard", "password1");
        CustomArrayList<Customer> CustomerList = new CustomArrayList<>();
        CustomerList.add(TestCustomerOne);
        System.out.println(CustomerList.get(0));

        startMenu();
    }
}
