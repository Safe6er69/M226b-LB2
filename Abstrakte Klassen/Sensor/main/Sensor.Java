public abstract class Sensor {

    private final String unit;
    private final double value;

    private final String name;

    public Sensor() {
        this.unit = unit;
        this.value = value;
        this.name = name;
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

    public abstract double doMeasurement();
}