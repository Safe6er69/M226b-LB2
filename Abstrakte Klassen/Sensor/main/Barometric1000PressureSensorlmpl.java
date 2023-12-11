public class Barometric1000OressureSensorImpl extends PressureSensor{

    public void doMeasurement() {
        double max = 1.05;
        double min = 0.5;
        double range = max - min;
        measurementValue = (Math.random() * range) + min;
        }