public class Aqualung2021ProDivePressureSensorImpl extends PressureSensor{

    public Aqualung2021ProDivePressureSensorImpl(String unit, double value, String name) {
        super(unit, value, name);
    }

    public void doMeasurement() {
        double max = 10;
        double min = 0;
        double range = max - min;
        measurementValue = (Math.random() * range) + min;
    }

}