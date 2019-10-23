import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CreateInvoice.calcPrice();
        //chooseMenu();
    }
    
    public static void chooseMenu(){
        Scanner in = new Scanner(System.in);
        int chosenMenu =1;
        System.out.print("Welcome to the Water Billing system, we have the following functions you can use\n" +
                "1. Manage Customers \n 2. Manage Reading Cards \n 3. Create invoice \n" +
                "4. Statics \n 5.Verify Payment \n 6. Manage Reminders ");
        do {
            System.out.println("Please Select the Function you wanna use by selecting a number from 1-6");
            if (in.hasNextInt()){
                chosenMenu = in.nextInt();
            }else{
                System.out.println("The following input doesn't match the Function menu");
            }
        }while(chosenMenu<1 || chosenMenu <6);
            switch (chosenMenu){
                case 1:
                    manageCustomers();
                    break;
                case 2:
                    manageReadingCards();
                    break;
                case 3:
                    createInvoice();
                    break;
                case 4:
                    manageStatistics();
                    break;
                case 5:
                    verifyPayments();
                case 6:
                    manageReminders();
                    break;
            }
    }

    private static void manageReminders() {

    }

    private static void verifyPayments() {

    }

    private static void manageStatistics() {
    }

    private static void createInvoice() {
    }

    private static void manageReadingCards() {
    }

    private static void manageCustomers() {
    }
}

