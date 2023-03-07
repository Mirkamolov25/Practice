package Practice6;

public class RAM {
    private final String type;
    private final int volume;
    private final double weight;

    public RAM(String type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public RAM setTypesOfRAM(String type) {
        return new RAM(type, volume, weight);
    }

    public RAM setVolume(int volume) {
        return new RAM(type, volume, weight);
    }

    public RAM setWeight(double weight) {
        return new RAM(type, volume, weight);
    }

    public String getType() {
        return type;
    }

    public int getVolume() {
        return volume;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "    RAM    " + "\n"
                + "Тип оперативной памяти: " + getType() + "\n"
                + "Объём оперативной памяти: " + getVolume() + "\n"
                + "Вес: " + getWeight();
    }
}
