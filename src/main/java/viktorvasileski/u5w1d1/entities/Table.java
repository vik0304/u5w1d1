package viktorvasileski.u5w1d1.entities;

public class Table {
    private int tableNumber;
    private int seatings;
    private boolean occupied;

    public Table(){};

    public Table(int tableNumber, int seatings, boolean occupied){
        this.tableNumber=tableNumber;
        this.seatings=seatings;
        this.occupied=occupied;
    }
}
