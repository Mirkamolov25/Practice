import core.Station;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CreateStationJson {
    public static JSONArray writeDataToJson() throws IOException {

        JSONArray js = new JSONArray();
        List<Station> stationsData = ObjectForParse.createStsforJson();
        for (int i = 0; i < stationsData.size(); i++) {
            JSONObject jsonObject = new JSONObject();
            //Объекты для первого файла
            jsonObject.put("line", stationsData.get(i).getLine());
            jsonObject.put("name", stationsData.get(i).getStation());
            jsonObject.put("connection", stationsData.get(i).getHasConnection());
            js.add(jsonObject);
        }
        JSONObject File = new JSONObject();
        File.put("Stations", js);
        FileWriter file = new FileWriter("C:\\Skillbox\\java_basics\\FilesAndNetwork\\data\\stations.json");
        file.write(File.toJSONString());
        file.flush();
        System.out.println(File);
        return js;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(writeDataToJson());
    }

}
