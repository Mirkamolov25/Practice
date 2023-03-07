import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

public class CreateMapMetroJsonFile {
    public static void main(String[] args) throws Exception {
        //mapMetro
        String url = "https://skillbox-java.github.io/";
        JSONObject json = new JSONObject();
        Stations stations = new Stations(url);
        HashMap<Integer, List<String>> map = new HashMap<>();
        for (int i = 1; i <= stations.getStation().size(); i++) {
            map.put(i, stations.getStation().get(i - 1));
        }
        try {
            json.put("stations", map);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(json);
        try (PrintWriter out = new PrintWriter(new FileWriter("C:\\Skillbox\\java_basics\\FilesAndNetwork\\data\\mapMetro.json"))) {
            out.write(json.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
