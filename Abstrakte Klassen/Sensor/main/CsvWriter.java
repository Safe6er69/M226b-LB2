import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

class CsvWriter {
        private Sensor sensor;
        private long interval; // Zeitintervall in Millisekunden
        private String fileName;

        public CsvWriter(Sensor sensor, long interval, String fileName) {
                this.sensor = sensor;
                this.interval = interval;
                this.fileName = fileName;
        }

        public void run() {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {

                        while (true) {
                                // Zeitstempel generieren
                                String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

                                // Messwerte aus dem Sensor lesen
                                String name = sensor.getName();
                                String unit = sensor.getUnit();
                                double measurement = sensor.doMeasurement();

                                // Messwerte in die CSV-Datei schreiben
                                writer.write(String.format("%s,%s,%s,%.2f", timeStamp, name, unit, measurement));
                                writer.newLine();
                                writer.flush(); // Datei sofort aktualisieren

                                // Warten bis zum nächsten Messintervall
                                Thread.sleep(interval);
                        }
                } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                }
        }
}