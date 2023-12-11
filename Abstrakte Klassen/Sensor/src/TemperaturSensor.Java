public abstract class TemperaturSensor extends Sensor {

    private String unit;
    protected double measurementValue;

    public double getValue() { return measurementValue}

    public String getUnit() { return unit }

}