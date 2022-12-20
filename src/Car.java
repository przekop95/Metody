import java.util.Objects;

public class Car extends Vehicle {
    private int power;
    private int year;

    public Car(String mark, String model, int power, int year) {
        super(mark, model);
        this.power = power;
        this.year = year;
    }

    public Car(int power, int year) {
        this.power = power;
        this.year = year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "power='" + power + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}


