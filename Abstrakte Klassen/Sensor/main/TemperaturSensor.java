public abstract class TemperaturSensor extends Sensor {
    protected double measurementValue = 69;

    public TemperaturSensor(String unit, double value, String name){
        super(unit, value, name);

    }

    public double getValue() { return measurementValue; }

}