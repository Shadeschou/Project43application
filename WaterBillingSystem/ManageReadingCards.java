import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ManageReadingCards {

    public static void insertReadingCardData() {

        Scanner in = new Scanner(System.in);
        int serialID, readingAmount, readingDate;

        System.out.println("Enter serial number of water meter: ");
        serialID = in.nextInt();

        System.out.println("Enter read amount of water: ");
        readingAmount = in.nextInt();

        System.out.println("Enter reading date ddmmyyyy: ");
        readingDate = in.nextInt();

        DB.insertSQL("INSERT INTO reading_card values(NULL," + readingDate + ",NULL," + readingAmount + ", " + serialID + ") ");
    }


}
