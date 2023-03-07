import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

public class JsonSimpleParser {
    private String path;

    public JsonSimpleParser(String path) {
        this.path = path;
    }

    public List<Object> getJsonFile() {
        JSONParser parser = new JSONParser();
        List<Object> string = new LinkedList<>();
        try (FileReader fileReader = new FileReader(path)) {
            JSONArray jsonArray = (JSONArray) parser.parse(fileReader);
            jsonArray.forEach(object -> string.add(object));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return string;
    }

    @Override
    public String toString() {
        return "JsonSimpleParser{" +
                "path='" + path + '\'' + "\n" +
                getJsonFile() +
                '}';
    }
    public JSONArray getJsonArray() {
        JSONParser parser = new JSONParser();
        JSONArray array = new JSONArray();
        try (FileReader fileReader = new FileReader(path)) {
            JSONArray jsonArray = (JSONArray) parser.parse(fileReader);
            array.add(jsonArray);
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return array;
    }
}