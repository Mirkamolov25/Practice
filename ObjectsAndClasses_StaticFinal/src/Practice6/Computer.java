package Practice6;

public class Computer {
    private CPU cpu;
    private RAM ram;
    private Storage storage;
    private Screen screen;
    private Keyboard keyboard;

    public Computer(CPU cpu, RAM ram, Storage storage, Screen screen, Keyboard keyboard) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        this.keyboard = keyboard;
    }


    /*
            Сеттеры для комплектующих:
            public void setCPU(CPU cpu) {
                cpu = cpu.setFrequency();
                cpu = cpu.setNumOfCores();
                cpu = cpu.setManufacture();
                cpu = cpu.setHeight();
            }

            public void setRAM(RAM ram) {
                ram.setTypesOfRAM();
                ram.setHeight();
                ram.setVolume();
            }

            public void setInformationStorage(InformationStorage storage) {
                storage.setTypeInformationStorage();
                storage.setHeight();
                storage.setVolumeStorage();
            }
            public void setScreen(Screen screen) {
                screen.setDiagonal();
                screen.setScreenType();
                screen.setHeight()
            }

             */
    //Геттеры для всех комплектующих:

    public CPU getCpu() {
        return cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public Screen getScreen() {
        return screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public double sumOfWeights() {
        return  cpu.getWeight() +
                ram.getWeight() +
                storage.getWeight() +
                screen.getWeight() +
                keyboard.getWeight();
    }

    public String toString() {
        return "Computer{" + "\n"
                + getCpu() + "\n" + "\n"
                + getRam() + "\n" + "\n"
                + getStorage() + "\n" + "\n"
                + getScreen() + "\n" + "\n"
                + getKeyboard() + "\n" + "\n"
                + "Общий вес компьютера: " + sumOfWeights() + "\n"
                + "}";
    }
}
