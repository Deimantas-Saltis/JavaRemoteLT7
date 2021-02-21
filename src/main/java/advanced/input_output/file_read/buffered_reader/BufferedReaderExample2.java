package advanced.input_output.file_read.buffered_reader;

import advanced.input_output.InputOutputUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample2 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(InputOutputUtils.DATA_FILE_LOCATION))) {
            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nebuvo rastas pagal nurodyta kelia: " + InputOutputUtils.DATA_FILE_LOCATION);
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Blogas failo formatas");
            System.out.println(ex.getMessage());
        }
    }
}
