import java.io.File;

public class Main {
    public static void main(String[] args) {
        Person person = JsonWorker.loadFromJSON(new File("Text.json"));
        System.out.println(person);
    }

}
