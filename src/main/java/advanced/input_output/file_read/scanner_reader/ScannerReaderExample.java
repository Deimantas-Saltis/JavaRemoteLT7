package advanced.input_output.file_read.scanner_reader;

import advanced.input_output.InputOutputUtils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerReaderExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File(InputOutputUtils.DATA_FILE_LOCATION))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException ex) {
            System.out.println("Blogas failo formatas arba failas nebuvo rastas");
            System.out.println(ex.getMessage());
        }
    }
}
