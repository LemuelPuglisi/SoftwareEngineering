package ids.decorator;

public class TicketVendor {

    public Sellable sellTicket () {
        return new Ticket();
    }

    public Sellable applyCoupons (Sellable ticket, int coupons) {
        if (coupons < 1) return ticket;

        for (int i = 0; i < coupons; ++i)
            ticket = new Coupon(ticket);
        return ticket;
    }

}
