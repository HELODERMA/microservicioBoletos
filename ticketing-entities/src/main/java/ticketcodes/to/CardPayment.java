package ticketcodes.to;

import javax.persistence.Transient;

public class CardPayment extends Payment {
    String pin;
    String name;
    String cardNo;
    @Transient
    String ccv;
}
