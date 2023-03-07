package Practice6;

public class Keyboard {
    private final String typeKeyboard;
    private final boolean hasBacklight;
    private final double weight;

    public Keyboard(String typeKeyboard, boolean hasBacklight, double weight) {
        this.typeKeyboard = typeKeyboard;
        this.hasBacklight = hasBacklight;
        this.weight = weight;
    }

    public Keyboard setTypeKeyboard(String typeKeyboard) {
        return new Keyboard(typeKeyboard, hasBacklight, weight);
    }

    public Keyboard setHasBacklight(boolean hasBacklight) {
        return new Keyboard(typeKeyboard, hasBacklight, weight);
    }

    public Keyboard setWeight(double weight) {
        return new Keyboard(typeKeyboard, hasBacklight, weight);
    }

    public String getTypeKeyboard() {
        return typeKeyboard;
    }

    public boolean isHasBacklight() {
        return hasBacklight;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "    Keyboard    " + "\n"
                + "Тип клавиатуры: " + getTypeKeyboard() + "\n"
                + "Наличие подсветики: " + (isHasBacklight() ? "Да" : "Нет") + "\n"
                + "Вес: " + getWeight();
    }
}
