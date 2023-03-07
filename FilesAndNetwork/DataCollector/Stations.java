import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;

public class Stations {
    String url;

    public Stations(String url) {
        this.url = url;
    }

    public static void main(String[] args) throws Exception {
        String url = "https://skillbox-java.github.io/";
        Stations stations = new Stations(url);
        System.out.println(stations);
    }

    public List<List<String>> getStation() throws Exception {
        Document page = Jsoup.parse(new URL(url), 3000);
        Elements elements = page.select("#metrodata").select("[data-line]");
        Elements lines = elements.select("div[data-line]");
        List<List<String>> list = new LinkedList<>();
        for (int i = 0; i < lines.size(); i++) {
            List<String> stations = new LinkedList<>();
            stations.add(lines.get(i).text());
            list.add(stations);
        }
        return list;
    }

    public String getStationListFormat() throws Exception {
        StringBuilder builder = new StringBuilder();
        Document page = Jsoup.parse(new URL(url), 3000);
        Elements elements = page.select("#metrodata").select("[data-line]");
        Elements lines = elements.select("div[data-line]");
        for (int i = 1; i <= lines.size(); i++) {
            builder.append(i + "-линия" + "\n").append(lines.get(i - 1).text()).append("\n");
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        try {
            return getStationListFormat().toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
