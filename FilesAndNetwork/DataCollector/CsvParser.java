import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;

public class CsvParser {
    private String path;

    public CsvParser(String path) {
        this.path = path;
    }

    public HashSet<String> loadInformation() {
        HashSet<String> data = new HashSet<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            for (String line : lines) {
                String[] fragments = line.split(",");
                if (fragments.length != 2) {
                    System.out.println("wrong lines: " + line);
                    continue;
                }
                data.add(fragments[0] + " " + fragments[1]);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return data;
    }


    @Override
    public String toString() {
        return "CSV{" +
                "path='" + path + '\'' + "\n" +
                loadInformation() +
                '}';
    }
}
