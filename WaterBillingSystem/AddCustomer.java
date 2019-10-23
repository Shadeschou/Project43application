import java.util.Scanner;

public class AddCustomer {
    public static void main(String[] args) {


    //add new customer

    //create Scanner
    Scanner in = new Scanner(System.in);
    in.useDelimiter( "\n");

    //hold data for new customer in variables
    System.out.println("Please input customer ID No:");
    int customerId = in.nextInt();

    System.out.println ("Please input customer type: 1, 2, or 3 (1=agriculture, 2=industry, 3=private household)");
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
    DB.insertSQL("insert into customer values ('"+customerId+"', '"+segmentType+"', '"+customerAddress+"', '"+zipCode+"', '"+customerName+"', '"+customerEmail+"', '1' )");

    }
}
