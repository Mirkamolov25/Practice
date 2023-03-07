package core;

import java.util.ArrayList;
import java.util.List;

public class Line implements Comparable<Line>{
    private String number;
    private String lineName;
    private List<Station> stations;

    public Line(String number, String lineName) {
        this.number = number;
        this.lineName = lineName;
        stations = new ArrayList<>();
    }

    public String getNumber() {
        return number;
    }

    public String getLineName() {
        return lineName;
    }
    public void addStation(Station station) {
        stations.add(station);
    }

    public List<Station> getStations() {
        return stations;
    }

    @Override
    public int compareTo(Line line) {
        return Integer.compare(Integer.parseInt(line.getNumber()), Integer.parseInt(number));
    }
    public boolean equals(Object obj) {
        return compareTo((Line) obj) == 0;
    }
}
