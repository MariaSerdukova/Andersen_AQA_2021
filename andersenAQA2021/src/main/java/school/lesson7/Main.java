package school.lesson7;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        File file = new File("fileLesson7.csv");

        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {{100, 200, 123}, {300, 400, 500}};

        AppData inf = new AppData(header, data);

        inf.save(file.getPath()); //Реализовать сохранение данных в csv файл;
        inf.dataReader(file.getPath()); //Реализовать загрузку данных из csv файла. Файл читается целиком.


    }
}
