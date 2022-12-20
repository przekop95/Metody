public class Vehicle {
    private String mark;
    private String model;

    public Vehicle(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }

    public Vehicle() {
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
