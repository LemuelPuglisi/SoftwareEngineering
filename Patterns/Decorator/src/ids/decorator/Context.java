package ids.decorator;

import java.util.Scanner;

/**
 * This programs sells concert tickets.
 * A Ticket has a price, but an user can
 * apply cumulatively coupons to reduce it.
 */
public class Context {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Sellable concertTicket = new Ticket();

        System.out.println("How many coupons do you have?");
        int couponsQuantity = input.nextInt();

        for (int i = 0; i < couponsQuantity; ++i) {
            concertTicket = new Coupon(concertTicket);
        }

        System.out.println("Ticket price is " + concertTicket.getPrice() + " $");
    }

}
