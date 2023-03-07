import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;

public class Lines {
    String url;

    public Lines(String url) {
        this.url = url;
    }

    public List<String> getLines() throws Exception {
        Document page = Jsoup.parse(new URL(url), 3000);
        Elements elements = page.select("#metrodata").select("[data-line]");
        Elements lines = elements.select("span[data-line]");
        List<String> strings = new LinkedList<>();
        for (int i = 0; i < lines.size(); i++) {
            String line = i + 1 + ". " + lines.get(i).text() + "\n";
            strings.add(line);
        }
        return strings;
    }

    @Override
    public String toString() {
        try {
            return getLines().toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
