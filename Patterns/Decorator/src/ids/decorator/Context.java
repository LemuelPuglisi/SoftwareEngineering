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

        TicketVendor seller = new TicketVendor();
        Sellable concertTicket = seller.sellTicket();

        System.out.println("How many coupons do you have?");
        int couponsQuantity = input.nextInt();

        concertTicket = seller.applyCoupons(concertTicket, couponsQuantity);
        System.out.println("Ticket price is " + concertTicket.getPrice() + " $");
    }

}
