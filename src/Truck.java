public class Truck extends Vehicle{
    private String kindOf;
    private int capacity;

    public Truck(String mark, String model, String kindOf, int capacity) {
        super(mark, model);
        this.kindOf = kindOf;
        this.capacity = capacity;
    }

    public Truck(String kindOf, int capacity) {
        this.kindOf = kindOf;
        this.capacity = capacity;
    }
}
