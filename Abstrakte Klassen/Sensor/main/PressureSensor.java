public abstract class PressureSensor extends Sensor {

    private String unit;
    protected double measurementValue;

    public PressureSensor(String unit, double value, String name) {
        super();
    }

    public double getValue() { return measurementValue; }

    public String getUnit() { return unit; }
}