import java.util.Scanner;
import java.text.*;

/**
 * The Main class allows users to calculate and track their earnings or losses per share based on daily closing prices.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your buying price per share: ");
        double buyingPrice = scan.nextDouble();

        int day = 1;
        double closingPrice = 0.1;

        DecimalFormat df = new DecimalFormat("0.00");

        while (true) {

            System.out.println("Enter the closing price for the day " + day + " (enter any negative value to exit): ");

            closingPrice = scan.nextDouble();

            if (closingPrice < 0) {
                break;
            }

            double earnings = closingPrice - buyingPrice;

            if (earnings > 0) {
                System.out.println("After day " + day + ", you earned " + df.format(earnings) + " per share.");
            } else if (earnings < 0) {
                System.out.println("After day " + day + ", you lost " + df.format(-earnings) + " per share.");
            } else if (earnings == 0) {
                System.out.println("After day " + day + ", you have no earnings per share.");
            }

            day++;
        }

        scan.close();
    }
}
