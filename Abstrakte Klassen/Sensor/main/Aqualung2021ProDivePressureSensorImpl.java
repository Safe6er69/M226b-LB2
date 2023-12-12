import org.junit.Test;

public class Aqualung2021ProDivePressureSensorImpl extends PressureSensor{

    public void doMeasurement() {
        double max = 10;
        double min = 0;
        double range = max - min;
        measurementValue = (Math.random() * range) + min;
    }

}