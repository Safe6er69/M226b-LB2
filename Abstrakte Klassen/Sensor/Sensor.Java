public abstract class Sensor {

    private String unit;
    private double value;
    private String name;

    public Measurement(String unit, double value, String name) {
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

}