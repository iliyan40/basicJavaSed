package besicSED;

import java.io.FileNotFoundException;

public class Sed {

    //replace the first word in the text with the second word
    //and edit the file by applying the changes to it.
    public static void substituteAndApply(String filePath,String wordToFind, String wordToReplace){
        String newText = substitute(filePath,wordToFind,wordToReplace);
        FileEditor.editFile(filePath,newText);
    }


    //replace the first word in the text with the second word
    //and returns a String with the changes applied without editing the file.
    public static String substitute(String filePath,String wordToFind, String wordToReplace){
        try {
            String text = FileEditor.readFile(filePath);
            String regexForWord = "\\b" + wordToFind + "\\b" ;
            text = text.replaceAll(regexForWord,wordToReplace);
            return text;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return "!error!";
    }
}
