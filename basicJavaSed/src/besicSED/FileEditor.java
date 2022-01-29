package besicSED;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileEditor {
    //returns String that contains the text in a file that you specify by path.
    public static String readFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        StringBuilder SB = new StringBuilder();
        while (scanner.hasNext()){
            SB.append(scanner.nextLine());
            if(scanner.hasNext()){
                SB.append("\n");
            }
        }
        return SB.toString();
    }
    //edits the file with new text in it.
    public static void editFile(String filePath,String newText){
        try {
            FileWriter FW = new FileWriter(filePath);
            FW.write(newText);
            FW.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
