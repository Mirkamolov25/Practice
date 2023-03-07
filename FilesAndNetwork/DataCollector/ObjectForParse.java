import core.Station;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ObjectForParse {
    public static Document getPage() throws IOException {
        String url = "https://skillbox-java.github.io/";
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    }

    public static List<Station> createStsforJson() throws IOException {
        Document page = getPage();
        List<Station> neededStations = new ArrayList<>();
        Elements AllStationsInfo = page.getElementsByClass("js-metro-stations");
        Elements AllLines = page.getElementsByClass("js-metro-line");
        Elements stNames = page.getElementsByClass("name");
        String connectingStations = page.getElementsByClass("t-icon-metroln").toString();

        int stTableNumber = 0;

        String hasConnection = "";
        for (int i = 0; i < AllLines.size(); i++) {
            for (int j = 0; j < AllStationsInfo.get(i).
                    getElementsByClass("name").size(); j++) {
                if (connectingStations.contains(stNames.get(stTableNumber).text())) {
                    hasConnection = "true";
                } else {
                    hasConnection = "false";
                }
                String lineNumber = AllLines.get(i).text();
                neededStations.add(new Station(stNames.get(stTableNumber).text(), lineNumber, hasConnection));
                stTableNumber++;
            }
        }
        return neededStations;
    }
}