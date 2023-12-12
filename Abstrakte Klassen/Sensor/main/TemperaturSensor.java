public abstract class TemperaturSensor extends Sensor {

    private String unit;
    protected double measurementValue;

    public TemperaturSensor(String unit, double value, String name) {
        super();
    }

    public double getValue() { return measurementValue; }

    public String getUnit() { return unit; }

}