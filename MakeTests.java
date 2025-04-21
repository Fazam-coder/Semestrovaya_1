import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

public class MakeTests {
    public static void main(String[] args) throws IOException {
        Random r = new Random();
        Path file = Paths.get("data.txt");
        ArrayList<String> lines = new ArrayList<>();
        int count1 = r.nextInt(50, 100);
        for (int i = 0; i < count1; i++) {
            String line = "";
            int count2 = r.nextInt(100, 10000);
            for (int j = 0; j < count2; j++) {
                line += (r.nextInt(0, 10000) + " ");
            }
            lines.add(line);
        }
        Files.write(file, lines);
    }
}
