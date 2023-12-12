import org.junit.Test;

public abstract class Sensor {

    public Sensor(String unit, double value, String name) {
        this.unit = unit;
        this.value = value;
        this.name = name;
    }

    public Sensor() {

    }

    public String getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public abstract void doMeasurement();
}