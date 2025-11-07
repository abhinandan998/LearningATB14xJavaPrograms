package ex_27__Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab212_Throws {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader f = new FileReader(new File("C://abc.txt"));

    }
}
