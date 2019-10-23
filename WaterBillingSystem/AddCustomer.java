import java.util.Scanner;

public class AddCustomer {
    public static int addCustomer() {
        int chosenMenu = -1;

        //create Scanner
        Scanner in = new Scanner(System.in);
        in.useDelimiter("\n");

        System.out.println("The following functions can be found in the customer manager\n" +
                "1. Add Customer\n" +
                "press 0 to go back");

        while (chosenMenu == -1) {

            if (in.hasNextInt()) {
                chosenMenu = in.nextInt();
                if (chosenMenu == 0) {
                    return -1;
                } else if (chosenMenu != 1) {
                    chosenMenu = -1;
                }
            } else {
                System.out.println("Input doesn't match menu number try number 1 or 0 for going back");
            }
        }


        //add new customer


        //hold data for new customer in variables
        System.out.println("Please input customer ID No:");
        int customerId = in.nextInt();

        System.out.println("Please input customer type: 1, 2, or 3 (1=agriculture, 2=industry, 3=private household)");
        int segmentType = in.nextInt();

        System.out.println("Please input street and House No:");
        String customerAddress = in.next();

        System.out.println("Please input zipCode:");
        int zipCode = in.nextInt();

        System.out.println("Please input customer name:");
        String customerName = in.next();

        System.out.println("Please input customer Email:");
        String customerEmail = in.next();


        //insert data for new custromer into Database
        DB.insertSQL("insert into customer values ('" + customerId + "', '" + segmentType + "', '" + customerAddress + "', '" + zipCode + "', '" + customerName + "', '" + customerEmail + "', '1' )");
        return 0;
    }
}
