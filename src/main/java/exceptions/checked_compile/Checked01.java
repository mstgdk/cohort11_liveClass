package exceptions.checked_compile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Checked01 {
    public static void main(String[] args) throws IOException {
        //read1();
       read2();
    }

    public static void read1() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\mstgd\\IdeaProjects\\cohort11_liveClass\\src\\main\\java\\exceptions\\checked_compile\\file.txt");

        int k = 0;
        while ((k = fis.read()) != -1) {
            System.out.print((char) k);
        }
    }

    public static void read2() {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\mstgd\\IdeaProjects\\cohort11_liveClass\\src\\main\\java\\exceptions\\checked_compile\\file.txt");

            int k = 0;
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
