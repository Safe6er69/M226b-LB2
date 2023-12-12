public class Main {
    public static void main(String[] args) {
        // Beispiel-Nutzung der CsvWriter-Klasse
        Sensor sensor = new Sensor(){
            @Override
            public double doMeasurement() {

                return 0;
            }
        }; // Beispiel-Sensor
        long interval = 5000; // Beispiel-Intervall: 5 Sekunden
        String fileName = "sensor_data.csv"; // Beispiel-Dateiname

        CsvWriter csvWriter = new CsvWriter(sensor, interval, fileName);
        csvWriter.run();
    }

}