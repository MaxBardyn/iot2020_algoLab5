package lab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReader {


    public static ArrayList<String> reader(String fileName) {

        var strings = new ArrayList<String>();
        try (var bufferedReader = new BufferedReader(new java.io.FileReader(fileName))) {
            var line = bufferedReader.readLine();
            while (line != null) {
                strings.add(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }
}
