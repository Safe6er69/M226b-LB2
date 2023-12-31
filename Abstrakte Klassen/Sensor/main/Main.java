public class Main {
    public static void main(String[] args) {
        // Beispiel-Nutzung der CsvWriter-Klasse
        Sensor sensor = new Thermo2000Impl("Celcius", 2000, "Temparatur");// Beispiel-Sensor

        long interval = 2000; // Beispiel-Intervall: 5 Sekunden
        String fileName = "sensor_data.csv"; // Beispiel-Dateiname

        CsvWriter csvWriter = new CsvWriter(sensor, interval, fileName);
        csvWriter.run();
    }
}