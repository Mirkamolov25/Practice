package Practice6;

public class CPU {
    private final int frequency;
    private final int numOfCores;
    private final String manufacturer;
    private final double weight;

    public CPU(int frequency, int numOfCores, String manufacturer, double weight) {
        this.frequency = frequency;
        this.numOfCores = numOfCores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public CPU setFrequency(int frequency) {
        return new CPU(frequency, numOfCores, manufacturer, weight);
    }

    public CPU setNumOfCores(int numOfCores) {
        return new CPU(frequency, numOfCores, manufacturer, weight);
    }

    public CPU setManufacture(String manufacturer) {
        return new CPU(frequency, numOfCores, manufacturer, weight);
    }

    public CPU setWeight(double weight) {
        return new CPU(frequency, numOfCores, manufacturer, weight);
    }

    public int getFrequency() {
        return frequency;
    }

    public int getNumOfCores() {
        return numOfCores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "    CPU    " + "\n"
                + "Частота: " + getFrequency() + "\n"
                + "Количество ядер: " + getNumOfCores() + "\n"
                + "Производитель: " + getManufacturer() + "\n"
                + "Вес: " + getWeight();
    }
}
