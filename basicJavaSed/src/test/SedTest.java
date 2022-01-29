package test;
import besicSED.Sed;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;
class SedTest {
    @Test
    void substituteAndApply() throws IOException {
        File file = new File("src\\textFilesForTesting\\TestSubstituteAndApply.txt");
        String expected = "Hello, Iliyan!";
        String actual;
        FileWriter FW = new FileWriter(file);
        FW.write("Hello, world!");
        FW.close();
        Sed.substituteAndApply("src\\textFilesForTesting\\TestSubstituteAndApply.txt",
                "world",
                "Iliyan");
        Scanner scanner = new Scanner(file);
        actual = scanner.nextLine();
        assertEquals(expected,actual);
    }
    @Test
    void substitute1() {
        String expected;
        String actual;
        expected = "world, world.\n" +
                "hi\n" +
                "world world.\n" +
                "world world\n" +
                "helloworld";
        actual = Sed.substitute("src\\textFilesForTesting\\Test1.txt",
                "hello",
                "world");
        assertEquals(expected,actual);
    }
    @Test
    void substitute2() {
        String expected;
        String actual;
        expected = "pickaxe\n" +
                "sword\n" +
                "pick\n" +
                "PICKAXE\n" +
                "Pick\n" +
                "Axe";
        actual = Sed.substitute("src\\textFilesForTesting\\Test2.txt",
                "axe",
                "sword");
        assertEquals(expected,actual);
    }
    @Test
    void substitute3() {
        String expected;
        String actual;
        expected = "Hello, this is TEST sentence.\n" +
                "helloTHiSisTestSentence.";
        actual = Sed.substitute("src\\textFilesForTesting\\Test3.txt",
                "test",
                "TEST");
        assertEquals(expected,actual);
    }
}
