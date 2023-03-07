package Practice6;

public class Storage {
    private final typeInformationStorage type;
    private final int volumeStorage;
    private final double weight;

    public Storage(typeInformationStorage type, int volumeStorage, double weight) {
        this.type = type;
        this.volumeStorage = volumeStorage;
        this.weight = weight;
    }

    public Storage setTypeInformationStorage(typeInformationStorage type) {
        return new Storage(type, volumeStorage, weight);
    }

    public Storage setVolumeStorage(int volumeStorage) {
        return new Storage(type, volumeStorage, weight);
    }

    public Storage setWeight(double weight) {
        return new Storage(type, volumeStorage, weight);
    }

    public typeInformationStorage getType() {
        return type;
    }

    public int getVolumeStorage() {
        return volumeStorage;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "    Storage    " + "\n"
                + "Тип накопительной памяти: " + getType() + "\n"
                + "Объём памяти: " + getVolumeStorage() + "\n"
                + "Вес: " + getWeight();
    }
}
