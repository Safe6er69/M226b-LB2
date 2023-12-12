public class Barometric1000PressureSensorImpl extends PressureSensor {

    public Barometric1000PressureSensorImpl(String unit, double value, String name) {
        super(unit, value, name);
    }

    public void doMeasurement() {
        double max = 1.05;
        double min = 0.5;
        double range = max - min;
        measurementValue = (Math.random() * range) + min;
    }
}