import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class Reader {

    public String getRandomWord(int length) {
        Path path = Paths.get("dictionary" + length + ".txt");
        try {
            List<String> lines = Files.readAllLines(path);
            int randomIndex = new Random().nextInt(lines.size());
            return lines.get(randomIndex);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
