package exception;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileReaderDemo {
    public static void readFile(String filename) throws FileNotFoundException{
        try (Scanner sc = new Scanner(new File(filename))){
            while (sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        }
    }
}