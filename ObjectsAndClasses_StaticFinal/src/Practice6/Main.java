package Practice6;

import java.sql.SQLData;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU(128, 8, "Intel", 0.045);
        RAM ram = new RAM("DDR", 16, 0.025);
        Storage storage = new Storage(typeInformationStorage.SSD, 512, 1.0);
        Screen screen = new Screen(15.9, ScreenType.IPS, 4.5);
        Keyboard keyboard = new Keyboard("membranous", true, 0.3);
        Computer computer = new Computer(cpu, ram, storage, screen, keyboard);
        System.out.println(computer);
    }
}
