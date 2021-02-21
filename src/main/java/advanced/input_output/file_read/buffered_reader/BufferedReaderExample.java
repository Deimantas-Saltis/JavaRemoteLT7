package advanced.input_output.file_read.buffered_reader;

import advanced.input_output.InputOutputUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader(InputOutputUtils.DATA_FILE_LOCATION);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            do {
                line = bufferedReader.readLine();
                if (line != null) {
                    System.out.println(line);
                }
            } while (line != null);

            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nebuvo rastas pagal nurodyta kelia: " + InputOutputUtils.DATA_FILE_LOCATION);
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Blogas failo formatas");
            System.out.println(ex.getMessage());
        }
    }
}