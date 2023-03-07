import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class Search {
    public static void main(String[] args) {
        Search search = new Search("C:/Users/Ibroh/Рабочий стол/data/");
        System.out.println(search);
    }

    private final String path;

    public Search(String path) {
        this.path = path;
    }

    public List<String> getJsonFiles(File rootFile, List<String> json) {
        if (rootFile.isDirectory()) {
            File[] directoryFiles = rootFile.listFiles();
            if (directoryFiles != null) {
                for (File file : directoryFiles) {
                    if (file.isDirectory()) {
                        getJsonFiles(file, json);
                    } else {
                        if (file.getName().
                                substring(file.getName().lastIndexOf("."))
                                .equals(".json")) {
                            json.add(file + "\n");
                        }
                    }
                }
            }
        }
        return json;
    }

    public List<String> getCsvFiles(File rootFile, List<String> csv) {
        if (rootFile.isDirectory()) {
            File[] directoryFiles = rootFile.listFiles();
            if (directoryFiles != null) {
                for (File file : directoryFiles) {
                    if (file.isDirectory()) {
                        getCsvFiles(file, csv);
                    } else {
                        if (file.getName().
                                substring(file.getName().lastIndexOf("."))
                                .equals(".csv")) {
                            csv.add(file + "\n");
                        }
                    }
                }
            }
        }
        return csv;
    }

    @Override
    public String toString() {
        return "JSON-files:" + "\n" +
                getJsonFiles(new File(path), new LinkedList<>()) + " \n" +
                "CSV-files:" + "\n" +
                getCsvFiles(new File(path), new LinkedList<>()) + " \n";

    }
}
