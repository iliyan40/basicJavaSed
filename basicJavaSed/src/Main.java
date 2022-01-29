import besicSED.Sed;
public class Main {
    public static void main(String[] args) {
        System.out.println(Sed.substitute("src\\textFilesForTesting\\Test1.txt","hello","HI"));
        Sed.substituteAndApply("src\\textFilesForTesting\\Test1.txt","greetings","hello");
    }
}
