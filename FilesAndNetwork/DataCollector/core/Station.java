package core;

public class Station implements Comparable<Station> {
    private String line;
    private String station;
    private String hasConnection;

    public Station(String station, String line, String hasConnection) {
        this.station = station;
        this.line = line;
        this.hasConnection = hasConnection;
    }

    public String getStation() {
        return station;
    }

    public String getLine() {
        return line;
    }

    public String getHasConnection() {
        return hasConnection;
    }

    @Override
    public int compareTo(Station station)
    {
        int lineComparison = line.compareTo(station.getLine());
        if(lineComparison != 0) {
            return lineComparison;
        }
        return this.station.compareToIgnoreCase(station.getStation());
    }
    public String toString()
    {
        return station;
    }

}
