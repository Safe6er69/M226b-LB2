public abstract class Sensor {

    private String unit;
    private double value;
    private String name;

    public Sensor(String name, double value, String unit) {
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