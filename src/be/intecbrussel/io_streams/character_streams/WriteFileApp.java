package be.intecbrussel.io_streams.character_streams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteFileApp {

    public static void main(String[] args) {

//        Scanner kbd = new Scanner(System.in);  //
//
//        while (true) {
//            try {
//                int choice = kbd.nextInt();  // Alex
//            } catch (InputMismatchException im) {
//                kbd.next();
//                im.printStackTrace();
//            }
//        }

        Path pathTotallyNotNeededAttAll = Paths.get("MyTextFile.txt");

        File file = pathTotallyNotNeededAttAll.toFile();
        Path copy = file.toPath();

        System.out.println(pathTotallyNotNeededAttAll);
        System.out.println(file);

        try (FileWriter fWriter = new FileWriter(pathTotallyNotNeededAttAll.toFile());
             FileWriter fileWriter = new FileWriter("SecondFile.txt")) {

            fWriter.write("Hello ");
            fWriter.write("again!");

            fileWriter.write("This is also closed after the try with resources");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
