package test;
import besicSED.FileEditor;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;
import static org.junit.jupiter.api.Assertions.*;
class FileEditorTest {
    @Test
    void readFile() throws FileNotFoundException {
        String expected = "This is a file made for testing the fileEditor class.";
        String actual = FileEditor.readFile("src\\textFilesForTesting\\TestFileEditor.txt");
        assertEquals(expected,actual);
    }
}