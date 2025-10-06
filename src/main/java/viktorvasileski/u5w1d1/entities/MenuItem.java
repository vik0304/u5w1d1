package viktorvasileski.u5w1d1.entities;


public abstract class MenuItem {
    protected String name;
    protected int calories;
    protected double price;

    public MenuItem(){};

    public MenuItem(String name, int calories, double price){
        this.name=name;
        this.calories=calories;
        this.price=price;
    }

    @Override
    public String toString() {
        return "MenuItem" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price;
    }
}
