package viktorvasileski.u5w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Table {
    private int tableNumber;
    private int seatings;
    private boolean occupied;
    private double costoCoperto;

    public void print() {
        System.out.println("numero tavolo--> " + tableNumber);
        System.out.println("numero massimo coperti--> " + seatings);
        System.out.println("occupato/libero--> " + (this.occupied ? "Libero" : "Occupato"));
    }
}
