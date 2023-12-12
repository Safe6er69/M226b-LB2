public abstract class TemperaturSensor extends Sensor {

    private String unit;
    protected double measurementValue = 69;

    public TemperaturSensor(String unit, double value, String name){
        super();

    }

    public double getValue() { return measurementValue; }

    public String getUnit() { return unit; }

}