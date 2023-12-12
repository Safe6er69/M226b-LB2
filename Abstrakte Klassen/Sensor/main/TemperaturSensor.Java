import org.junit.Test;

public abstract class TemperaturSensor extends Sensor {

    private String unit;
    protected double measurementValue;

    public TemperaturSensor(String unit, double value, String name) {
        super(unit, value, name);
    }

    public double getValue() { return measurementValue}

    public String getUnit() { return unit }

}