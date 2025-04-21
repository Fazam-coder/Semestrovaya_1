import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TestSort {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("data.txt"));
        for (String line: lines) {
            String[] items = line.split(" ");
            int[] lst = new int[items.length];
            for (int i = 0; i < lst.length; i++) {
                lst[i] = Integer.valueOf(items[i]);
            }

            long start = System.nanoTime();
            MergeSort.sort(lst);
            long end = System.nanoTime();
            System.out.println(lst.length + " " + (end - start));

        }
    }
}
