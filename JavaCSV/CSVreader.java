package JavaCSV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVreader {
    public static void main(String[] args) {
   
    String path = "";
    String line = "";

    try {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        try {
            while ((line = reader.readLine()) != null) {
                String[] vals = line.split(",");
                System.out.println("Date: " + vals[0] + ", Crime descr: " + vals[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
    }
    }
}
