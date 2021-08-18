package school.lesson7;

import java.io.*;

public class AppData {

    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public void save(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
// Запишем в строку sb заголовок header
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < header.length - 1; i++) {
                sb.append(header[i]).append("; ");
            }
            sb.append(header[header.length - 1]).append("\n");
// Запишем строку sb в файл
            writer.write(String.valueOf(sb));

// Запишем в строку sb1 массив строк, разделенных ;
            StringBuilder sb1 = new StringBuilder();
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length - 1; j++) {
                    sb1.append(data[i][j]).append(";");
                }
                sb1.append(data[data.length - 1][data.length - 1]).append("\n");
            }
// Запишем строку sb1 в файл
            writer.write(String.valueOf(sb1));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void dataReader(String fileName) {
        try (FileReader reader = new FileReader(fileName)) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}